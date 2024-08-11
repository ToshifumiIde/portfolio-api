package portfolioapi.portfolioapi.service;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.stereotype.Service;
import portfolioapi.portfolioapi.model.Test;
import portfolioapi.portfolioapi.repository.TestRepository;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class TestService {

  private final TestRepository testRepository;

  public Test getByUuid(String uuid) {
    Test result = testRepository.getByUuid(uuid);

    if (Objects.isNull(result)) {
        throw new RuntimeException("not found uuid: " + uuid);
    }

    return result;
  }
}
