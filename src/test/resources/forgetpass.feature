Feature: Forget password
  Scenario: Validate user should not be able to access the forget password page successfully
    Given open the browser
    And enter the url
    And click on the forget password link
    And enter the registered email
    When user is clicking on submit button
    Then user should be able to receive reset password link

  Scenario: validate user should not be able to reset password with unregistered email
    Given open the browser
    And enter the url
    And click on the forget password link
    And enter the unregistered email
    When user is clicking on submit button
    Then user should see error message

  Scenario: validate user should not to reset password with empty email field
    Given open the browser
    And enter the url
    And click on the forget password link
    When user is clicking on submit button
    Then user should see validation message for email field

  Scenario Outline: validate user should be able  to reset password with valid email
    Given open the browser
    And enter the url
    And click on the forget password link
    And enter the email"<email>"
    When user is clicking on the submit button
    Then user should be able to receive reset password link
    Examples:
      |email|
      |mango0001@gmail.com|

  Scenario: validate user should be able  to reset password with valid email
    Given open the browser
    And enter the url
    And click on the forget password link
    And enter the email"<orange00022@gmail.com>"
    When user is clicking on the submit button
    Then user should be able to receive reset password link

  Scenario: validate user should be able to receive confirmation message after submitting registered email
    Given open the browser
    And enter the url
    And click on the forget password link
    And enter the registered email
    When user is clicking on submit button
    Then user should see confirmation message

  Scenario:validate user should not be able to reset password using expired reset link
    Given user has received expired reset password link
    When user click on expired link message
    Then user should see expired link message

  Scenario: validate user should not be able to reset password if new password and confirm password do not match
    Given user is on reset password page
    And enter new password
    And enter different conform password
    When  user click on reset button
    Then user should see password mismatch message

  Scenario: validate user should not be able to set password less than required length
    Given user is on reset password page
    And enter password less then required length
    When user click on reset button
    Then user should see password length validation message

  Scenario: validate user should not be able to set password without uppercase character
    Given user is on reset password page
    And enter password without uppercase character
    When user click on reset button
    Then user should be see password policy message

  Scenario: validate user should not be able to set password without numeric value
    Given user is on reset password page
    And enter password without numeric value
    When user click on reset button
    Then user should see password policy message