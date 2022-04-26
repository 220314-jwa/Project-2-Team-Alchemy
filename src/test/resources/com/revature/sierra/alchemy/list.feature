@list
Feature: List feature


Scenario: search restaurant by city and zipcode

	Given User is at Homepage
	When User inputs restaurant by city
	And User  able to see all the restaurants in that city
    And User inputs  restaurant by zipcode
	Then User can able to see all the restaurants  in that zipcode.
	And list of restaurant will display.
	
	
	