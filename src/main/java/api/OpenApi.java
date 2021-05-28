package api;

import api.client.example.participation.model.ParticipantGet;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface OpenApi {

    @Operation(summary = "Find an user by their email", tags = {"participation-service"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the user",
                    content = {@Content(
                            schema = @Schema(implementation = ParticipantGet.class))})

    })

    @GetMapping(value = "/v1/email/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    ParticipantGet getParticipant(@PathVariable("email") String email);
}
