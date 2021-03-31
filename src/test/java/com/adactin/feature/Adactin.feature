Feature: Login functionality for Adactin Application 

Scenario: User enter valid username and valid password 
	Given User luanch application 
	When User enter "SowmiyaSri" as username 
	And User enter "Sowmiya05" as password 
	Then User verify valid username and valid password 
		
Scenario: User given the search hotel details
    When User choose the "Melbourne" in location
    And user choose the "Hotel Sunshine" in hotels
    And user choose the "Double" selected in room type
    And user choose the "3" selected in number of rooms
    And User enter "30/03/2021" as datepick
    And User enter "31/03/2021" as dateout
    And user choose the "3" selected in adults room
    And user choose the "2" in child room
    Then user verify the given options
	
Scenario: User select the hotel
    When User want to click the radio batten
    Then User want to continue the page	
	
