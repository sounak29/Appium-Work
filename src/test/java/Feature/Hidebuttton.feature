@Hidebutton
Feature: Check Hidebuttn

  Scenario: Verify Hide button
    When user click on Animation
    And user click Hide-Show Animation
    Then user is on the 'Animation/Hide-Show Animations' Activity  
    When user click on button 0  and 1 to hide 
    Then use only see the remaining buttons that are '2' and '3'