@RateRestaurant
Feature: Rating a Restaurant
  I want to use this template for my feature file

  @tag1
  Scenario: user gets the address
    Given the user is "homepage"
    And given the user wrote a review
    When the user clicks on a star rating
    And the user clicks submit
    Then the user will be send to a restaurant page
	Scenario: A user is trying to rate a restaurant
		Given The user is already signed in on the app
		When The user wants to leave a review on a restaurant
		And The user clicks on the search button and types in name of restaurant
		And The customer selects the restaurant and navigates to their ratings tab
		Then The user clicks the text box to write a review
		And The user selects number of stars
	Scenario: A user is trying to write a review
		Given: The user logged in and picked a restaurant
		When: The User wants to pick a review
		Then: the user clicks the comment section 

@tag2
Scenario: Restaurant Owner access users review
Given: The Restaurant Owner is a user with a usertype as Restaurant Owner
And: The Restaurant Owner logs in as an admin to restaurant page
When: The Restaurant Owner to view all reviews and ratings
And: The Restaurant Owner clicks on view reviews
And: The Restaurant Owner clicks on comment
And: The Restaurant owner clicks submit to leave a response.
Then: The Restaurant owner is directed back to the view reviews page