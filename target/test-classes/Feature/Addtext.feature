@Addtext
Feature: Check Add button Functionality

  Scenario Outline: Verify Add button
    When user click on Text
    And user click on Log TextBox
    Then user able to see the screen title as "<title>"
    When user click on Add
    Then Text is added as "<text>"
    
            
    Examples:
    |			title			|    text      |
    |Text/LogTextBox|This is a test|
    
