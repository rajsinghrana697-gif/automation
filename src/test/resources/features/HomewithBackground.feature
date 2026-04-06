#
#@background
#Feature: testing homepage with background keyword
#  Background: login with valid credentials
#    Given click login button to navigate in login page
#    Given enter the username and password
#    Then user is click on login button
#
##  @back
##  Scenario Outline: verify user should able to navigate to catalog
##    Given click on the catalog
##    Then choose a product
##    And click on the cart button
##    Then click on the Check Out button
##    Then Validate on the Check Out button
##    Then enter the Contact detail "<first name>" "<last name>" "<Pin code>"
##    And enter the Payment detail "<Card Number>" "<Expiration Date>" "<Security code>" "<Name on card>"
##
##    Examples:
##      | first name | last name | Pin code | Card Number       | Expiration Date | Security code | Name on card |
##      | Raj        | Kumar     | 700001   | 5243 6365 6963 7355 | 06/27        | 720        | Raj Kumar    |
#
#@sun
#Scenario Outline: verify user should able to navigate to catalog
#  Given click on the catalog
#  Then choose a product you want to buy
#  Then click on  Add to Cart button
#  And click on  my cart button
#  Then click on the Check Out button which navigate to the payment details
#  Then enter the Contact detail "<first name>" "<last name>" "<Pin code>"
#  And enter the Payment detail "<Card Number>" "<Expiration Date>" "<Security code>" "<Name on card>"
#  Examples:
#    | first name | last name | Pin code | Card Number       | Expiration Date | Security code | Name on card |
#    | Raj        | Kumar     | 700001   | 5243 6365 6963 7355 | 06/27        | 720        | Raj Kumar    |
Feature: testingHomePage with BG KeyWord
  Background: login with valid credentials
    Given click on login tab
    Given enter the username and password
    Then  clicking on login button


  @data
  Scenario Outline: verify user should be able to navigate to catalog tab
    Given click on the catalog
    Then choose a product
    Then add to cart the product
    Then Validate the numbering on My Cart on clicking on Add to Cart button "<productTitle>"
    Then click on add cart
    When click on checkout button
    Then Validate the title of checkout page "<expectedCheckoutPageTitle>"
    When User is clicking on checkout button
    Then Validate the title of Contact detail and payment page "<expectedPaymentDetailPageTitle>"
    When User is entering Contact Detail
    Then enter card details
    And Click on Pay Now button
    Examples:
      |productTitle|expectedCheckoutPageTitle| expectedPaymentDetailPageTitle|
      |Black heels – Sauce Demo|Your Shopping Cart – Sauce Demo|Checkout - Sauce Demo|