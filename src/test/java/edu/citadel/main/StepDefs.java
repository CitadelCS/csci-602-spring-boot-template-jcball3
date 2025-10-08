package edu.citadel.main;

import static org.junit.jupiter.api.Assertions.*;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.ResponseEntity;

public class StepDefs extends SpringIntegrationTest {

    @When("the client calls {string}")
    public void the_client_calls(String path) {
        executeGet(path);
    }

    @Then("the response status should be {int}")
    public void the_response_status_should_be(int statusCode) {
        ResponseEntity<String> response = getLatestResponse();
        assertNotNull(response, "No response received");
        assertEquals(statusCode, response.getStatusCodeValue(), "Unexpected status code");
    }

    @Then("the response should contain {string}")
    public void the_response_should_contain(String content) {
        ResponseEntity<String> response = getLatestResponse();
        assertNotNull(response.getBody(), "Response body is null");
        assertTrue(response.getBody().contains(content), "Expected content not found in response");
    }
}