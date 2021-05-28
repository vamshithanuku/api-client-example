/*
 * Raffle Service Participation API
 * API for Raffle Service Participation
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package api.client.example.participation.model;

import java.util.Objects;
import api.client.example.participation.model.InlineResponse404Error;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse404
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-27T20:21:07.926653-04:00[America/New_York]")public class InlineResponse404 {

  @JsonProperty("error")

  private InlineResponse404Error error = null;
  public InlineResponse404 error(InlineResponse404Error error) {
    this.error = error;
    return this;
  }

  

  /**
  * Get error
  * @return error
  **/
  @Schema(description = "")
  public InlineResponse404Error getError() {
    return error;
  }
  public void setError(InlineResponse404Error error) {
    this.error = error;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse404 inlineResponse404 = (InlineResponse404) o;
    return Objects.equals(this.error, inlineResponse404.error);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse404 {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}