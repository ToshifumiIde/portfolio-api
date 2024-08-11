package portfolioapi.portfolioapi.convertor;

import org.springframework.stereotype.Component;
import portfolioapi.portfolioapi.controller.test.model.TestReadDto;
import portfolioapi.portfolioapi.controller.test.model.TestRegistrationDto;
import portfolioapi.portfolioapi.model.Test;
import portfolioapi.portfolioapi.util.UuidGenerate;

@Component
public class TestConvertor {

  /**
   * テストEntityをTestDtoに変換する
   *
   * @param test テストEntity
   * @return testDto テストDto
   */
  public TestReadDto entityToDto(Test test) {
    TestReadDto testDto = new TestReadDto();
    testDto.setUuid(test.getUuid());
    testDto.setTitle(test.getTitle());
    testDto.setDescription(test.getDescription());
    return testDto;
  }

  /**
   * テスト登録DtoをテストEntityに変換する
   *
   * @param testRegistrationDto テストDto
   * @return testEntity テストEntity
   */
  public Test registrationDtoToEntity(TestRegistrationDto testRegistrationDto) {
    Test testEntity = new Test();
    testEntity.setUuid(UuidGenerate.generate());
    testEntity.setTitle(testRegistrationDto.getTitle());
    testEntity.setDescription(testRegistrationDto.getDescription());
    return testEntity;
  }
}
