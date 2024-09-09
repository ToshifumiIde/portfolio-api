package portfolioapi.portfolioapi.exception;

import org.springframework.http.HttpStatus;


public class BusinessException extends RuntimeException {
  private HttpStatus httpStatus;
  private String title;
  private String detail;

  public BusinessException (HttpStatus httpStatus, String description, String detail) {
    this.httpStatus = httpStatus;
    this.title = description;
    this.detail = detail;
  }

  public HttpStatus getHttpStatus(){
    return httpStatus;
  }

  public String getTitle(){
    return title;
  }
  public String getDetail(){
    return detail;
  }
}
