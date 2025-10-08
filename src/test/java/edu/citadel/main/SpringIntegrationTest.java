package edu.citadel.main;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringIntegrationTest {

    @Autowired
    protected TestRestTemplate restTemplate;

    protected ResponseEntity<String> latestResponse;

    protected void executeGet(String path) {
        latestResponse = restTemplate.getForEntity(path, String.class);
    }


    public ResponseEntity<String> getLatestResponse() {
        return latestResponse;
    }
}