Feature: Validating Place API's


Scenario: Verify if Place is Being Successfully added using AppPlaceAPI
      Given Add Place Payload
      When user calls "AppPlaceAPI" with Post http request
      Then the API call is success with status code 200
      And "status" in response body is "OK"
      And "scope" in response body is "APP"
