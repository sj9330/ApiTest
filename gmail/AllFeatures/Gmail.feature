Feature: Gmail application

  Scenario: test gmail login functionality
    Given User is on login page
    When User enter emailid and click on Next button 
    And  User enter password
    Then USer click on Next button

  Scenario: test Gmail sub-module functionality
    Given User is on HomePage
    When User create new label
    And User rename the label
    Then User will validate the lable name

    #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