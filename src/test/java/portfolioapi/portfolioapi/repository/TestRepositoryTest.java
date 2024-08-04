package portfolioapi.portfolioapi.repository;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import portfolioapi.testhelper.MySqlContainerContextInitializer;


@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TestRepositoryTest extends MySqlContainerContextInitializer {

  @Autowired
  TestRepository testRepository;

  // JUnit test for Test
  @DisplayName("test")
  @Test
  public void given_whenGetTestByUuid_thenReturnTestObject() {
    // given - pre-condition or setup
    int id1 = 1;
    String uuid1 = "00000000000000000000000000000001";
    String title1 = "test1";
    String description1 = "description1";

    portfolioapi.portfolioapi.model.Test result1 = new portfolioapi.portfolioapi.model.Test(id1, uuid1,title1,description1);


    // when - action or behaviour
    portfolioapi.portfolioapi.model.Test result = testRepository.getByUuid(uuid1);

    // then - verify the result or output
    Assertions.assertThat(result).isNotNull();
    Assertions.assertThat(result.getUuid()).isEqualTo(result1.getUuid());
    Assertions.assertThat(result.getTitle()).isEqualTo(result1.getTitle());
    Assertions.assertThat(result.getDescription()).isEqualTo(result1.getDescription());

  }

}
