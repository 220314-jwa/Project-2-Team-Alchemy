@OrderOnline
Feature: Order online

	Scenario: User wants to order food
		Given the User is at "Homepage"
		When the user clicks on " See Menu and Order"
		And the user navigate to  "Menu" Options
		And the user clicks on particular item 
		And the user enters the quantity 
		And the user clicks "AddCart" options 
		And the user enters payment form
		And the user clicks "Place Order Now" button
		Then the user can see the confirmation page.