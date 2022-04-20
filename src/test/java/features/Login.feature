
@Login
Feature: Login Feature
  I want to use this template for my feature file

  @tag1
  Scenario: Login unsuccessfully
		Given User arrives at sign in page
		When Customer enters credentials in the username and password field
		And The credentials are incorrect
		And The user tries to reset their credentials
		Then Prompt user to enter the email they used to sign up
