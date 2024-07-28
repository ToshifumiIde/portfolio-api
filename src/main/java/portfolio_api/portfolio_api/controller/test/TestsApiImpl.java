package portfolio_api.portfolio_api.controller.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import portfolio_api.portfolio_api.controller.test.model.TestDto;
import portfolio_api.portfolio_api.controller.test.model.TestRegistrationDto;
import portfolio_api.portfolio_api.controller.test.model.TestRow;

public class TestController implements TestsApi {
  @Override
  public ResponseEntity<Void> createTest(TestRegistrationDto testRegistrationDto) {
    return null;
  }

  @Override
  public ResponseEntity<Void> deleteTest(String uuid) {
    return null;
  }

  @Override
  public ResponseEntity<TestDto> getTest(String uuid) {
    return null;
  }

  @Override
  public ResponseEntity<TestRow> listTests(String title, String description) {
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Void> updateTest(String uuid, TestRegistrationDto testRegistrationDto) {
    return null;
  }
}
