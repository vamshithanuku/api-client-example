package client;

import api.client.example.participation.api.ParticipationServiceApi;
import api.client.example.participation.model.ParticipantGet;
import lombok.AllArgsConstructor;
import org.springframework.util.StringUtils;
import springfox.documentation.annotations.Cacheable;

@AllArgsConstructor
public class ParticipantService {
    private final ParticipationServiceApi participationServiceApi;

    @Cacheable("email")
    public ParticipantGet getParticipantObject(final String email) {
        if(!StringUtils.isEmpty(email)) {
            return participationServiceApi.getParticipant(email);
        }
        return null;
    }
}
