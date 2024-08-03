package portfolioapi.portfolioapi.controller.test;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import portfolioapi.portfolioapi.controller.test.model.TestDto;
import portfolioapi.portfolioapi.controller.test.model.TestRegistrationDto;
import portfolioapi.portfolioapi.controller.test.model.TestRow;
import portfolioapi.portfolioapi.model.Test;
import portfolioapi.portfolioapi.service.TestService;


@RestController
@RequiredArgsConstructor
public class TestsApiImpl implements TestsApi {

  private final TestService testService;

  @Override
  public ResponseEntity<Void> createTest(TestRegistrationDto testRegistrationDto) {
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Void> deleteTest(String uuid) {
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @Override
  public ResponseEntity<TestDto> getTest(String uuid) throws NotFoundException {

    Test entity = testService.getByUuid(uuid);

    TestDto dto = new TestDto();
    dto.setUuid(entity.getUuid());
    dto.setTitle(entity.getTitle());
    dto.setDescription(entity.getDescription());

    return new ResponseEntity<>(dto, HttpStatus.OK);
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
