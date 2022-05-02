@ViewReview
Feature: User View Review of a Restaurant

  @tag1
  Scenario: View Review of a Restaurant
    Given the user is at the "list" page
    When the user clicks on a restaurant
    And the user clicks on review section
    Then the app shows a list of review of that restaurant
    
  Scenario: View the most popular Review of a Restaurant
    Given the user is at the "list" page
    When the user clicks on a restaurant
    And the user clicks on review section
    And the user clicks on "sort by popular review"
    Then the app shows a sorted list of review by popularity

  Scenario: View the most recent Review of a Restaurant
    Given the user is at the "list" page
    When the user clicks on a restaurant
    And the user clicks on review section
    And the user clicks on "sort by the most recent"
    Then the app shows a sorted list of review recently
