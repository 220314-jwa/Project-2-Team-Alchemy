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
Feature: Restaurant Owner Features
  I want to use this template for my feature file

@tag2
Scenario: Restaurant Owner access users review
	Given: The Restaurant Owner is a user with a usertype as Restaurant Owner
	And: The Restaurant Owner logs in as an admin to restaurant page
	When: The Restaurant Owner clicks on view reviews
	Then: The Restaurant owner is directed to the reviews page
	
Scenario: Restaurant Owner response to a user review
	Given: The Restaurant Owner is on reviews page
	When: The Restaurant Owner clicks on comment
	And : The Restaurant owner clicks submit to leave a response.
	Then: The Restaurant owner is directed back to the view reviews page
