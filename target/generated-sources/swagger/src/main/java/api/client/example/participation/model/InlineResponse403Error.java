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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse403Error
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-27T20:21:07.926653-04:00[America/New_York]")public class InlineResponse403Error {

  @JsonProperty("message")

  private String message = null;

  @JsonProperty("code")

  private String code = null;
  public InlineResponse403Error message(String message) {
    this.message = message;
    return this;
  }

  

  /**
  * Get message
  * @return message
  **/
  @Schema(example = "Access Denied", description = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public InlineResponse403Error code(String code) {
    this.code = code;
    return this;
  }

  

  /**
  * Get code
  * @return code
  **/
  @Schema(example = "403", description = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse403Error inlineResponse403Error = (InlineResponse403Error) o;
    return Objects.equals(this.message, inlineResponse403Error.message) &&
        Objects.equals(this.code, inlineResponse403Error.code);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(message, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse403Error {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
