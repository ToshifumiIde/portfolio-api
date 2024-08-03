package portfolioapi.portfolioapi.repository;

import org.springframework.stereotype.Repository;
import portfolioapi.portfolioapi.model.Test;

@Repository
public interface TestRepository {
  Test getByUuid(String uuid);
}
