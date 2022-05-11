
@Comment
Feature: Comment feature

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

<<<<<<< HEAD
//////////////////////////////////////////////////

  @tag2
  Scenario Outline: Commenting under a review posted by another user
    Given The user already looked up the restaurant, selected restaurant from "list"
    And Navigated to the 'Review' tab on the restaurant page 
    And The user sees all the reviews listed
    And The user selects a particular review to read about a customer's experience
    When The user needs to leave a comment on a customer's review to either agree/disagree
    Then The user select the 'comment' icon and a text box appears

  Scenario Outline: The customer needs to post their comment
    Given The user is in the review section of a restaurant's page 
    And They clicked on the comment icon to leave a comment on the review
    And a text box appears that prompts them to type their comment
    And Below the box, a 'submit' button appears 
    And The box becomes clickable once the user starts typing 
    When The user is done typing and they would like to sumbit their comment
    Then The customer clicks on the 'submit' button and the comment is saved under the review
      
=======
>>>>>>> 237e9ec70b689c773b8695bf45f341e4393f27c9
  
