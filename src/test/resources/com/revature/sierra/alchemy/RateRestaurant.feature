@RateRestaurant
Feature: Rating a Restaurant

  Scenario: user gets the address
    Given the user is "homepage"
    And given the user wrote a review
    When the user clicks on a star rating
    And the user clicks submit
    Then the app show the restaurant page
	Scenario: A user is rating a restaurant
		Given The user is signed in on the app
		When the user types in name of restaurant
		And the user clicks "search" button
		And The user selects the restaurant 
		And the user clicks on "rate the restaurant"
		And The user selects number of stars
		And the user clicks submit button
		Then the application updates the rating of that restaurant
		
