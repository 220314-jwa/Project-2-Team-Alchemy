@Restaurant
Feature:  Restaurant

  Scenario: user able to search the restaurant
  Given the user is at "restaurant" page
  And user inputs "Restaurantname" on restaurant text field
  When user clicks on the "Search" tab
  Then user should able to see the restaurant below.
  
  Scenario: user writing a review
  Given the user is at "Review" tab
  And the user clicks the "Review" section
  And the user clicks on "write a review"
  And the user inputs the review in text area
  And the user clicks submit
  Then the app submits the review
  And the app updates the restaurant review
  
  Scenario: user is rating a restaurnat
    Given the user is "restaurant"
    And  the user wrote a review
    When the user clicks on a star rating
    And the user clicks submit
    Then the app show the restaurant page
  
  
  
#  
#  /*
#    Given the user is "homepage"
#    And given the user wrote a review
#    When the user clicks on a star rating
#    And the user clicks submit
#    Then the app show the restaurant page
#	Scenario: A user is rating a restaurant
#		Given The user is signed in on the app
#		When the user types in name of restaurant
#		And the user clicks "search" button
#		And The user selects the restaurant 
#		And the user clicks on "rate the restaurant"
#		And The user selects number of stars
#		And the user clicks submit button
#		Then the application updates the rating of that restaurant
#		
#*/