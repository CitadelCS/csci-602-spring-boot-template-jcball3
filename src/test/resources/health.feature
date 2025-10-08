Feature: Health endpoint

  Scenario: Check application health
    When the client calls "/health"
    Then the response status should be 200
    And the response should contain "ok"
