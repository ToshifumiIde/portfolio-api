package portfolioapi.portfolioapi.controller.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import portfolioapi.portfolioapi.controller.test.model.TestDto;
import portfolioapi.portfolioapi.controller.test.model.TestRegistrationDto;
import portfolioapi.portfolioapi.controller.test.model.TestRow;


@RestController
public class TestsApiImpl implements TestsApi {
  @Override
  public ResponseEntity<Void> createTest(TestRegistrationDto testRegistrationDto) {
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Void> deleteTest(String uuid) {
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @Override
  public ResponseEntity<TestDto> getTest(String uuid) {
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @Override
  public ResponseEntity<TestRow> listTests(String title, String description) {
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Void> updateTest(String uuid, TestRegistrationDto testRegistrationDto) {
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
