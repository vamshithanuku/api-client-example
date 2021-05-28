package config;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import api.client.example.participation.invoker.ApiClient;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustAllStrategy;

import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import java.security.*;

@Slf4j
@Configuration
@EnableCaching
@ComponentScan(basePackages = "com.example.participation.api")
public class ParticipationConfig {

    @Value("$security.keystore.path")
    private String keyStorePath;

    @Value("$security.keystore.password")
    private String keyStorePassword;

    @Value("$security.trustStore.path")
    private String trustStorePath;

    @Value("$security.trustStore.password")
    private String trustStorePassword;


    @Bean
    public ApiClient participationServiceClient(@Value("${participant-service.base.path}") final String basePath) {
        //use if you want to create secured rest template
        //final ApiClient apiClient = new ApiClient(generateSecuredRestTemplate());
        final ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(basePath);
        return apiClient;
    }

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("email");
    }

    public RestTemplate generateSecuredRestTemplate() {
        return new RestTemplate(getHttpComponentsClientHttpRequestFactory());
    }

    private HttpComponentsClientHttpRequestFactory getHttpComponentsClientHttpRequestFactory() {
        try {
            final KeyStore keyStore = KeyStore.getInstance("jks");
            keyStore.load(new ClassPathResource(keyStorePath).getInputStream(), keyStorePassword.toCharArray());

            final KeyStore trustStore = KeyStore.getInstance(keyStore.getType());
            trustStore.load(new ClassPathResource(trustStorePath).getInputStream(), trustStorePassword.toCharArray());

            final SSLContext sslContext = SSLContextBuilder.create()
                    .loadKeyMaterial(keyStore, keyStorePassword.toCharArray())
                    .loadTrustMaterial(trustStore, TrustAllStrategy.INSTANCE).build();

            final CloseableHttpClient client = HttpClients.custom().setSSLContext(sslContext).build();
            final HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
            httpComponentsClientHttpRequestFactory.setHttpClient(client);
            return httpComponentsClientHttpRequestFactory;

        } catch (Exception e) {
            throw new SecurityException(e);
        }
    }
}
