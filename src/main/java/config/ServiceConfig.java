package config;

import api.client.example.participation.api.ParticipationServiceApi;
import client.ParticipantService;
import controller.ApplicationController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    ParticipationServiceApi participationServiceApi() {
        return new ParticipationServiceApi();
    }

    @Bean
    ParticipantService participantService() {
        return new ParticipantService(participationServiceApi());
    }

    @Bean
    ApplicationController applicationController() {
        return new ApplicationController(participantService());
    }
}
