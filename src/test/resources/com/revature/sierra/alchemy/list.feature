@List
Feature: List feature

	Scenario: List of restaurants 
		Given User is on restaurant page
		And the user clicks a restaurant card
		Then the restaurant info sheet is displayed
