@home
Feature: Home feature

Background:
	Given user is on homepage

	Scenario: User lands on home page
		When User clicks on home link
		Then User lands on home page 
		
	Scenario: user lands to restaurant page
		When User clicks on restaurant link
		Then User lands on restaurant page 
	
	Scenario: user lands to login page
		When User clicks on login link
		Then User lands on login page 
	
	Scenario: user lands to signup page
		When User clicks on signup link
		Then User lands on signup page 
	
	
	
		