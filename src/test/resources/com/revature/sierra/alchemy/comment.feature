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
@tag
Feature: Comment feature
  I want to use this template for my feature file

  @tag1
  Scenario: user leaves a comment as anonymous
    Given that the user dose not need to be signed in
    And is on restaurant info section
    When the user clicks in the text box to writes a review
    And the user clicks on the submit button 
    Then the review is placed into the restaurant review section
    And the username is seen as anonymous

	Scenario: user leaves a comment with user name
		Given that the user has to be signed in 
		And is on restaurant info section
		When the user click in the text box to write a review
		And clicks the submit button 
		Then the review is placed into the restaurant review section
		And the username is displayed


  
