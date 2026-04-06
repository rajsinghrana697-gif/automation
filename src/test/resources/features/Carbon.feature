Feature: cred API of carbon application
  Scenario Outline: validate user should be able to create data with valid username and password
    Given create the request body and url
    When Hit the request body
    Then validate the response code "<responsecode>"
    Examples:
      |responsecode|
      |200|