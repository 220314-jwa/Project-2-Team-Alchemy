@SignUp
Feature: SignUp feature

  Scenario: SignUp scenario successfully
    Given user is on homepage
    When user clicks on member sign up link
    Then user lands on signup page
    And user inputs "FirstName" on firstname text field
    And user inputs "LastName" on lastname text field
    And user inputs "Email" on email text field
    And user inputs "Password" on password text field
    And user clicks submit button 
    Then user should be able to signup successfully
    
    
    
#    //
#    Then user is given access to member services of the app
#    And user is alerted that user is signed in 
#    
#  Scenario: LogIn scenario unsuccessfully
#    Given user arrives at the homepage
#    When user clicks on member sign on button 
#    And user inputs "username" on username text field
#    And user inputs "password" on password text field
#    Then the app shows sign-in fails 
#    And the app asks user to retry credentials
#
#  Scenario: User Registeration 
#    Given: user arrives at the homepage
#    When: user clicks the register user button
#    And: user inputs username
#    And: user inputs email address 
#    Then: user is given access to view her registered profile
#//