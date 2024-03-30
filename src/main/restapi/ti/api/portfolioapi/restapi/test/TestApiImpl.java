package ti.api.portfolioapi.restapi.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiImpl implements TestApi {
    @Override
    public ResponseEntity<Void> getTest() {
        return ResponseEntity.ok().build();
    }
}
