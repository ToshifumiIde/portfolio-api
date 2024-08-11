package portfolioapi.portfolioapi.service;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import portfolioapi.portfolioapi.repository.TestRepository;

public class TestServiceTest {

  @Autowired
  private TestRepository testRepository;

  @Autowired
  private TestService testService;
  @BeforeEach
  public void setup(){
     testRepository = BDDMockito.mock(TestRepository.class);
     testService = new TestService(testRepository);
  }

    // JUnit test for getTestByUuid method
      @DisplayName("JUnit test for getTestByUuid method")
      @Test
      public void givenTestObject_whenGetTestByUuid_thenReturnTestObject(){
        // given - pre-condition or setup
        portfolioapi.portfolioapi.model.Test test = new portfolioapi.portfolioapi.model.Test();
        test.setId(1);
        test.setUuid("a012345678901234567890123456789z");
        test.setTitle("title");
        test.setDescription("description");

        BDDMockito.given(testRepository.getByUuid(test.getUuid())).willReturn(test);

        // when - action or behaviour
        portfolioapi.portfolioapi.model.Test result = testService.getByUuid(test.getUuid());

        // then - verify the result or output
        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result.getId()).isEqualTo(test.getId());
        Assertions.assertThat(result.getUuid()).isEqualTo(test.getUuid());
        Assertions.assertThat(result.getTitle()).isEqualTo(test.getTitle());
        Assertions.assertThat(result.getDescription()).isEqualTo(test.getDescription());

      }
}
