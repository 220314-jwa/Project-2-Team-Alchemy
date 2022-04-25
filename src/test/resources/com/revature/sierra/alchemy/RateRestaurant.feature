@RateRestaurant
Feature: Rating a Restaurant
  I want to use this template for my feature file

  Scenario: user gets the address
    Given the user is "homepage"
    And given the user wrote a review
    When the user clicks on a star rating
    And the user clicks submit
    Then the app show the restaurant page
	Scenario: A user is rating a restaurant
		Given The user is signed in on the app
		When The user wants to leave a review on a restaurant
		And The user clicks on the search button and types in name of restaurant
		And The customer selects the restaurant and navigates to their ratings tab
		Then The user clicks the text box to write a review
		And The user selects number of stars
		
	Scenario: A user is writing a review
		Given The user logged in and picked a restaurant
		When The user wants to pick a review
		And the user clicks the comment section 
		And the user writes a review

