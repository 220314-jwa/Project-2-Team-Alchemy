@ReviewRestaurant
Feature: Leaving a review
  I want to use this template for my feature file

  @tag1
  Scenario: The User is trying to leave a review after visitng the restaurant
    Given The user looks up the restaurant using the "list" feature
    And The user selects the "restaurant" and is directed to the 'restaurant info' page
    And The user scrolls to the review tab
    When The user clicks on "review"
    Then A text box appears and they are able to write a review about their experience
  
  ///Rating the restaurant
  
  Scenario: After writing the review and the customer wants to leave a rating
    Given The user is done writing the review in the text box
    And The user is prompted with 5 greyed out stars
    And There is an instruction for the user to select the number of stars
    And below the stars, there is a 'submit' button but it is not clickable
    When The customer clicks on the desired number of stars
    And The stars to the left light up
    And An automated text appears below the stars to confirm the number of stars selected
    Then The 'submit' box lights up and is clickable
    And Once the user clicks submit, the changes will be saved 
    And The the customer will be redirected to the review page to view the posted reviews
    
  