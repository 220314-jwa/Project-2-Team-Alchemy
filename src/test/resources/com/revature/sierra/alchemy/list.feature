@list
Feature: List feature

Scenario: search forlist of the restaurant
	Given User is at HomePage
	When  The user clicks on the "Homepage" Tab 
	Then A list of restaurants will show up. 

Scenario: the user wants to search Fastfood restaurant
	Given User is at HomePage
	When The user clicks on "Restaurant" Tab
	And  user is on Fastfood restaurant page
	Then user clicks on "Sonic Drive-in"
	Then user can see "Sonic Drive-in" Page

