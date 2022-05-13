@Restaurant
Feature:  Restaurant

  Scenario: user able to search the restaurant
  
  Given the user is at "restaurant" page
  And user inputs "Restaurantname" on restaurant text field
  When user clicks on the "Search" tab
  Then user should able to see the "Restaurantname" below.
  
  Scenario: user writing a review
  
  Given the user is at "restaurant" page
  And the user clicks on write a review button
  And the user clicks on a star rating
  And the user inputs the review in text area
  And the user clicks submit
  Then the app submits the review
  
  

 