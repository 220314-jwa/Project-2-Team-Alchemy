
@ReviewRestaurant
Feature: Review a Restaurant
	
	Scenario: A user is writing a review
		Given The user is on "list" page
		When The user click on a restuarant
		And the user clicks the "review" section
		And the user clicks on "write a review"
		And the user inputs the review in text area
		And the user clicks submit
		Then the app submits the review
		And the app updates the restaurant review

	