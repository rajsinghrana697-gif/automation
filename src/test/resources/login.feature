Feature: login page
  Scenario: validate user should be able to login with valid cred
    Given open the browser
    And enter the url
    And enter the cred
    When user is clicking on login button
    Then user should be able to navigate to homepage

  Scenario: validate user should be able to login with valid cred
    Given open the browser
    And enter the url
    And enter the cred "<rajsinghrana>" and "<9622>"
    When user is clicking on login button
    Then user should be able to navigate to homepage

  Scenario Outline: validate user should be able to login with valid cred
    Given open the browser
    And enter the url
    And enter the cred "<username>" and "<password>"
    When user is clicking on login button
    Then user should be able to navigate to homepage
    Examples:
      |username|password|
      |rajsinghrana|9622|