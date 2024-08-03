package portfolioapi.portfolioapi.controller.test.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TestRow
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TestRow {

  private Integer total;

  @Valid
  private List<@Valid TestDto> dataList;

  public TestRow total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * 総数
   *
   * @return total
   */

  @Schema(name = "total", example = "10", description = "総数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public TestRow dataList(List<@Valid TestDto> dataList) {
    this.dataList = dataList;
    return this;
  }

  public TestRow addDataListItem(TestDto dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

  /**
   * Test
   *
   * @return dataList
   */
  @Valid
  @Schema(name = "dataList", description = "Test", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataList")
  public List<@Valid TestDto> getDataList() {
    return dataList;
  }

  public void setDataList(List<@Valid TestDto> dataList) {
    this.dataList = dataList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRow testRow = (TestRow) o;
    return Objects.equals(this.total, testRow.total) &&
      Objects.equals(this.dataList, testRow.dataList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, dataList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestRow {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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

