package portfolioapi.testhelper;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.containers.output.Slf4jLogConsumer;


public abstract class MySqlContainerContextInitializer  {
  final static MySQLContainer MY_SQL_CONTAINER;

  private static final String USER_NAME = "username";
  private static final String PASSWORD = "password";
  private static final String DATABASE_NAME = "ti_db";
  private static final String INIT_SQL = "docker-entrypoint-initdb.d/init.sql";
  private static final String INIT_SQL_IN_CONTAINER = "/docker-entrypoint-initdb.d/init.sql";
  private static final Logger LOGGER = LoggerFactory.getLogger(MySqlContainerContextInitializer.class);

  static {
    MY_SQL_CONTAINER = (MySQLContainer) new MySQLContainer("mysql:8.4")
      .withUsername(USER_NAME)
      .withPassword(PASSWORD)
      .withDatabaseName(DATABASE_NAME)
//      .withLogConsumer(new Slf4jLogConsumer(LOGGER))
      .withClasspathResourceMapping(INIT_SQL, INIT_SQL_IN_CONTAINER, BindMode.READ_ONLY);
    MY_SQL_CONTAINER.start();
  }

  @DynamicPropertySource
  static void dynamicPropertySource(DynamicPropertyRegistry dynamicPropertyRegistry) {
    dynamicPropertyRegistry.add("spring.datasource.url", MY_SQL_CONTAINER::getJdbcUrl);
    dynamicPropertyRegistry.add("spring.datasource.username", MY_SQL_CONTAINER::getUsername);
    dynamicPropertyRegistry.add("spring.datasource.password", MY_SQL_CONTAINER::getPassword);
  }

}
