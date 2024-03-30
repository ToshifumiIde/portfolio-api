package ti.api.portfolioapi.restapi.test.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * TestDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TestDto {

  private String uuid;

  public TestDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TestDto(String uuid) {
    this.uuid = uuid;
  }

  public TestDto uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID
   * @return uuid
  */
  @NotNull 
  @Schema(name = "uuid", example = "a123456787890123456787890123456787890z", description = "UUID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestDto testDto = (TestDto) o;
    return Objects.equals(this.uuid, testDto.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestDto {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

