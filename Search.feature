@Search
Feature: search feature

	Scenario: search restaurant by name
		Given User is on restaurant page
		When the user inputs restaurant name
		And the user clicks search button
		And inpiut search valid
		Then the restaurant info card is displayed