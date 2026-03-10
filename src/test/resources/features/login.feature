@loginpage
Feature: login page
  Scenario: validate user should be able to login with valid cred
    Given open the browser
    And enter the url
    And enter the cred
    When user is clicking on login button
    Then user should be able to navigate to homepage
    And close the browser

  Scenario: validate user should be able to login with valid cred
    And enter the url
    And enter the cred "<rajsinghrana>" and "<9622>"
    When user is clicking on login button
    Then user should be able to navigate to homepage
    And close the browser

  Scenario Outline: validate user should be able to login with valid cred
    And enter the url
    And enter the cred "<username>" and "<password>"
    When user is clicking on login button
    Then user should be able to navigate to homepage
    And close the browser
    Examples:
      |username|password|
      |rajsinghrana|9622|
