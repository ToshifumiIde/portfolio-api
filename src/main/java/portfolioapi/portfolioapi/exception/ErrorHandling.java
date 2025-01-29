package portfolioapi.portfolioapi.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public enum ErrorHandling {
  CONNECTION_ERROR("Connection Error"),
  VALIDATION_ERROR("Validation Error"),
  RESOURCE_NOT_CREATED("Resource Not Created"),
  RESOURCE_NOT_FOUND("Resource Not Found");
  private String detail;
}
