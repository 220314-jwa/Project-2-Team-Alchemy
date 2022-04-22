@LocateRestaurant
Feature: Locate a Restaurant
  I want to use this template for my feature file
  Scenario: User gets restaurant address
    Given the user is on the "list" page
    When the user clicks on the "restaurant"
    Then information of the restaurant will pop out
    
  Scenario: User sees the restaurant on map
  	Given the user is on the "list" page
  	And information of the selected restaurant pops up
  	When the user clicks on the restaurant address
  	Then the application will show the restaurant on a map



