@background
Feature: testing homepage with background keyword
  Background: login with valid credentials
    Given click login button to navigate in login page
    Given enter the username and password
    Then user is click on login button

  Scenario Outline: Verify User should navigate to Account Details and Order History
    Then verify the title of the page "<expectedTitle>"
    Examples:
      |expectedTitle|
      |Account – Sauce Demo|

  Scenario Outline: verify user should able to navigate to catalog
    Given click on the catalog
    Then choose a product
    And click on the cart button
    Then click on the Check Out button
    Then Validate on the Check Out button
    Then enter the Contact detail "<first name>" "<last name>" "<Pin code>"
    And enter the Payment detail "<Card Number>" "<Expiration Date>" "<Security code>" "<Name on card>"

    Examples:
    Examples:
      | first name | last name | Pin code | Card Number       | Expiration Date | Security code | Name on card |
      | Raj        | Kumar     | 700001   | 5243 6365 6963 7355 | 06/27        | 720        | Raj Kumar    |


