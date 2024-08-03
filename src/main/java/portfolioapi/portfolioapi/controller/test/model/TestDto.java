package portfolioapi.portfolioapi.controller.test.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * TestDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TestDto {

  private String uuid;

  private String title;

  private String description;

  public TestDto uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID
   *
   * @return uuid
   */

  @Schema(name = "uuid", example = "a123456787890123456787890123456787890z", description = "UUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TestDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * タイトル
   *
   * @return title
   */

  @Schema(name = "title", example = "タイトル", description = "タイトル", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public TestDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * 説明
   *
   * @return description
   */

  @Schema(name = "description", example = "説明文", description = "説明", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
    return Objects.equals(this.uuid, testDto.uuid) &&
      Objects.equals(this.title, testDto.title) &&
      Objects.equals(this.description, testDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, title, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestDto {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

