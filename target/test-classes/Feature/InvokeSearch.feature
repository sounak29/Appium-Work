@InvokeSearch
Feature: Check Invoke Search

  Scenario Outline: Verify Invoke Search
    When user click on Apps
    And user click on search
    And user click on invoke search
    Then user see title as 'App/Search/Invoke Search'
    When user enter search details from excel sheet name is  "<Sheet Name>" and row number <Row Number>
    And click on On Search Request button
    And click on enter
    Then user  'App/Search/Query Search Results' page

    Examples: 
      | Sheet Name | Row Number |
      | Search Data| 0    		  |
