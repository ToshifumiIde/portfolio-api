package portfolioapi.portfolioapi.controller.test.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * テスト登録用Dto
 */

@Schema(name = "TestRegistrationDto", description = "テスト登録用Dto")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TestRegistrationDto {

  private String title;

  private String description;

  public TestRegistrationDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TestRegistrationDto(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public TestRegistrationDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * タイトル
   * @return title
  */
  @NotNull @Size(min = 1, max = 255) 
  @Schema(name = "title", example = "タイトルです", description = "タイトル", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public TestRegistrationDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * 説明
   * @return description
  */
  @NotNull @Size(min = 1, max = 1000) 
  @Schema(name = "description", example = "説明です", description = "説明", requiredMode = Schema.RequiredMode.REQUIRED)
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
    TestRegistrationDto testRegistrationDto = (TestRegistrationDto) o;
    return Objects.equals(this.title, testRegistrationDto.title) &&
        Objects.equals(this.description, testRegistrationDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestRegistrationDto {\n");
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

