package portfolioapi.portfolioapi.service;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import portfolioapi.portfolioapi.model.Test;
import portfolioapi.portfolioapi.repository.TestRepository;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class TestService {

  private final TestRepository testRepository;

  /**
   * テストEntityを登録する
   * @param test テストEntity
   * @exception RuntimeException 登録失敗時の例外処理
   * */
  @Transactional
  public void createTest(Test test) {
    int result = testRepository.createTest(test);
    if (!Objects.equals(result, 1)) {
      throw new RuntimeException("create fail");
    }
  }

  /**
   * UUIDを指定してテストを取得する
   * @param uuid UUID
   * @exception RuntimeException UUIDで検索できなかった場合の例外処理
   * */
  @Transactional
  public Test getByUuid(String uuid) {
    Test result = testRepository.getByUuid(uuid);
    if (Objects.isNull(result)) {
      throw new RuntimeException("not found uuid: " + uuid);
    }
    return result;
  }
}
