@list
Feature: List feature


Scenario: search restaurant by city and zipcode

	Given User is at Homepage
	When the user inputs restaurant by city
	And the user inputs "zipcode" form
	And the user clicks submit button
	Then the application shows all the restaurants in that zipcode in a list
	
		