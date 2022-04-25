#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
@ReviewRestaurant
Feature: Review a Restaurant
	
	Scenario: A user is writing a review
		Given The user is on "list" page
		When The user click on a restuarant
		And the user clicks the "review" section
		And the user clicks on "write a review"
		And the user inputs the review in text area
		And the user clicks submit
		Then the application submit the review
		And update the restaurant review

	