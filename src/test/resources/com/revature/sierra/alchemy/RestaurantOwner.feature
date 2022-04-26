
@RestaurantOwner
Feature: Restaurant Owner Features
  I want to use this template for my feature file

	@tag2
	Scenario: Restaurant Owner access users review
		Given: The Restaurant Owner is a user with a usertype as Restaurant Owner
		And: The Restaurant Owner logs in as an admin to restaurant page
		When: The Restaurant Owner clicks on view reviews
		Then: The Restaurant owner is directed to the reviews page
		
	Scenario: Restaurant Owner response to a user review
		Given: The Restaurant Owner is on reviews page
		When: The Restaurant Owner clicks on comment
		And: The Restaurant Owner inputs a comment
		And : The Restaurant owner clicks submit to leave a response.
		Then: The Restaurant owner is directed back to the view reviews page
