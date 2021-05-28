package api.client.example.participation.api;

import api.client.example.participation.invoker.ApiClient;

import api.client.example.participation.model.InlineResponse400;
import api.client.example.participation.model.InlineResponse401;
import api.client.example.participation.model.InlineResponse403;
import api.client.example.participation.model.InlineResponse404;
import api.client.example.participation.model.InlineResponse500;
import api.client.example.participation.model.Participant;
import api.client.example.participation.model.ParticipantGet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-27T20:21:07.926653-04:00[America/New_York]")@Component("api.client.example.participation.api.ParticipationServiceApi")
public class ParticipationServiceApi {
    private ApiClient apiClient;

    public ParticipationServiceApi() {
        this(new ApiClient());
    }

    @Autowired
    public ParticipationServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Post participant info
     * API for post participant info
     * <p><b>201</b> - success
     * <p><b>401</b> - Unauthorized Exception
     * <p><b>403</b> - Forbidden Exception
     * <p><b>400</b> - Bad Request Exception
     * <p><b>500</b> - Internal Server Exception
     * @return Participant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Participant addParticipant() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/v1/raffle-tool/participation/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Participant> returnType = new ParameterizedTypeReference<Participant>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get participant details for given user email
     * API for get participant for given user email
     * <p><b>200</b> - success
     * <p><b>401</b> - Unauthorized Exception
     * <p><b>403</b> - Forbidden Exception
     * <p><b>404</b> - Entity Not Found Exception
     * <p><b>400</b> - Bad Request Exception
     * <p><b>500</b> - Internal Server Exception
     * @param email path variable
     * @return ParticipantGet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ParticipantGet getParticipant(String email) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'email' when calling getParticipant");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("email", email);
        String path = UriComponentsBuilder.fromPath("/v1/raffle-tool/participation/email/{email}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ParticipantGet> returnType = new ParameterizedTypeReference<ParticipantGet>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
