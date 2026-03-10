@log
Feature: login page
  Scenario: validate user should be able to login with valid cred
   Enter the url
    And enter the cred
    When user is clicking on login button
    Then user should be able to navigate to homepage