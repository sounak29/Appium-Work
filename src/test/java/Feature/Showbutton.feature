@Showbutton
Feature: Check Showbutton

  Scenario: Verify Show button
    When user click on Animation
    And user click Hide-Show Animation
    Then user is on the 'Animation/Hide-Show Animations' Activity  
    When user click on button 0  and 1 to hide 
    And user click on Show buttons
		Then user able to see the button 0 and 1
