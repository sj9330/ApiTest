Feature: Validate employee end to end flow

  Scenario: to create new employees
    Given add new employee with help of name and job
    When user hit post request to create new employee
    Then user can validate response status "code" is "201"
    And user validate content header
    And user can validate response schema
    ##https://github.com/sj9330/ApiTest.git
    ##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
