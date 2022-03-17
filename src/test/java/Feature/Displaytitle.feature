@Title
Feature: Check Display Title button Functionality

  Scenario Outline: Verify Display Title
    When user click on Apps
    And user click on Action Bar button
    And user click on Display Option
    And user click on Display Show Title button
    Then user able to see the title "<title>"
    
        
    Examples:
    |							title								|
    |App/Action Bar/Display Option		|
    
