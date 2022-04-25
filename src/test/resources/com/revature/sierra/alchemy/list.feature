@list
Feature: List feature

Scenario: search forlist of the restaurant
	Given User is at HomePage
	When  The user clicks on "Homepage" Tab 
	Then A list of restaurants will show up. 
	
	
	Scenario: search restaurant by city and zipcode
	When User search restaurant by zipcode
	Then User should able to see all the restaurants  in that zipcode.
	