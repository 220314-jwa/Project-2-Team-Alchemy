
@Comment
Feature: Comment feature
  I want to use this template for my feature file

  @tag1
  Scenario: user leaves a comment as anonymous
    Given that the user dose not need to be signed in
    And is on restaurant info section
    When the user leaves a comment on a restaurant
    And clicks in the text box to writes a review
    And clicks on the submit button 
    Then the review is placed into the restaurant review section
    And the username is seen as anonymous

	Scenario: user leaves a comment with user name
		Given that the user has to be signed in 
		And is on restaurant info section
		When the user leaves a comment on a restaurant
		And click in the text box to write a review
		And clicks the submit button 
		Then the review is placed into the restaurant review section
		And the username is displayed

  
