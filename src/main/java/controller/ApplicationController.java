package controller;

import api.OpenApi;
import api.client.example.participation.model.ParticipantGet;
import client.ParticipantService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ApplicationController implements OpenApi {

    private ParticipantService participantService;

    @Override
    public ParticipantGet getParticipant(String email) {
        return participantService.getParticipantObject(email);
    }
}
