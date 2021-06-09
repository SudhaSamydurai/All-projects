Feature: Validating Place APIs

  Scenario Outline: Verify place is being successfully added by addPlace API's
    Given Add place payload "<name>" "<language>" "<address>"
    When User calls "AddPlacAPI" with http "post" request
    Then API call got success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    Then verify "<name>" is matching in "GetPlaceAPI" response
    
    Examples:
    
    |name						|language |address									|
    |Frontline house|French-IN|29, side layout, cohen 09|
    |Camel karo     |Spanish  |World croas broadline |
