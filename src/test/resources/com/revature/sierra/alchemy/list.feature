@list
Feature: List feature


Scenario: search restaurant by city and zipcode

	Given User is at Homepage
	When User  search restaurant by city
	Then User should  able to see all the restaurants in that city

	
	
	Scenario: search restaurant by city and zipcode

	When User search restaurant by zipcode
	Then User should able to see all the restaurants  in that zipcode.
	