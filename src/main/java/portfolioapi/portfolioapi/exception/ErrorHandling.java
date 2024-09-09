package portfolioapi.portfolioapi.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public enum ErrorHandling {
  VALIDATION_ERROR("Validation Error"),
  RESOURCE_NOT_CREATED("Resource Not Created"),
  RESOURCE_NOT_FOUND("Resource Not Found");
  private String detail;
}
