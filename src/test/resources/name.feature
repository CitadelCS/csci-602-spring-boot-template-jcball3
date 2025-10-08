Feature: Check name

  Scenario: Get application name
    When the client calls "/info"
    Then the response status should be 200
    And the response should contain "csci-602"