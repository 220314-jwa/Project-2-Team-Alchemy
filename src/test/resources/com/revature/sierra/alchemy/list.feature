@list
Feature: List feature


Scenario: search restaurant by city and zipcode

	Given User is at Homepage
	When User  search restaurant by city
	And User  able to see all the restaurants in that city
    And User search  restaurant by zipcode
	Then User can able to see all the restaurants  in that zipcode.
	
	
	
	