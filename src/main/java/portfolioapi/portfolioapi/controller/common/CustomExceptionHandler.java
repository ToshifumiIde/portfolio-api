package portfolioapi.portfolioapi.controller.common;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import portfolioapi.portfolioapi.controller.common.model.ErrorResponse;
import portfolioapi.portfolioapi.exception.BusinessException;
import portfolioapi.portfolioapi.exception.ErrorHandling;

@RestControllerAdvice
public class CustomExceptionHandler {

  @ExceptionHandler(BusinessException.class)
  public ResponseEntity<ErrorResponse> handleBusinessException(BusinessException e) {
    ErrorResponse response = new ErrorResponse();
    response.setStatusCode(e.getHttpStatus().value());
    response.setTitle(e.getTitle());
    response.setDetail(e.getDetail());
    return ResponseEntity.status(response.getStatusCode()).body(response);
  }

  @ExceptionHandler(ConstraintViolationException.class)
  public ResponseEntity<ErrorResponse> handleConstraintViolationException(ConstraintViolationException e) {
    ErrorResponse response = new ErrorResponse();
    response.setStatusCode(HttpStatus.BAD_REQUEST.value());
    response.setTitle(ErrorHandling.VALIDATION_ERROR.toString());
    response.setDetail(e.getMessage());
    return ResponseEntity.status(response.getStatusCode()).body(response);
  }
}