Feature: Login

  Scenario: Login with correct credentials
    Given Navigate to URL
    When Enter username and password and click on login button
    Then user should land on homepage
