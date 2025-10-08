Feature: Info endpoint

  Scenario: Get application info
    When the client calls "/info"
    Then the response status should be 200
    And the response should contain "version"
