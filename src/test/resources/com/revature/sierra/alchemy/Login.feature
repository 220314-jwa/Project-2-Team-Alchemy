
@Login
Feature: LogIn feature

  Scenario: Login scenario successfully
    Given user arrives at the homepage
    When user clicks on member sign on button
    And user inputs "username" on username text field
    And user inputs "password" on password text field
    And user clicks Enter button 
    Then user is given access to member services of the app
    And user is alerted that user is signed in 
    
  Scenario: LogIn scenario unsuccessfully
    Given user arrives at the homepage
    When user clicks on member sign on button 
    And user inputs "username" on username text field
    And user inputs "password" on password text field
    Then the app shows sign-in fails 
    And the app asks user to retry credentials

  Scenario: User Registeration 
    Given: user arrives at the homepage
    When: user clicks the register user button
    And: user inputs username
    And: user inputs email address 
    Then: user is given access to view her registered profile
