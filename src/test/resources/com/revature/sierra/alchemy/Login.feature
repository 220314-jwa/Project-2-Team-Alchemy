#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Login
Feature: LogIn feature
  I want to use this template for my feature file

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
    Then sign in fails and asks user to retry credentials
    
    
  @tag3
   Scenario: User Registeration 
    	Given: user arrives at the homepage
    	When: user clicks the register user button
    	And: user inputs username
    	And: user inputs email address 
    	Then: user is given access to view her registered profile
