Feature: testingHomePage with BG KeyWord
  Background: login with valid credentials
    Given click on login tab
    Given enter the username and password
    Then  clicking on login button


  @moon
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
      |Black heels - Sauce Demo|Your S0000000000000hopping Cart - Sauce Demo|Checkout - Sauce Demo|