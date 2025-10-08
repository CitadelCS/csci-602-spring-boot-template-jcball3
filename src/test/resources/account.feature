Feature: Account lookup by username

  Scenario: Get account by username
    When the client calls "/account/username/testuser"
    Then the response status should be 200
    And the response should contain "testuser"
