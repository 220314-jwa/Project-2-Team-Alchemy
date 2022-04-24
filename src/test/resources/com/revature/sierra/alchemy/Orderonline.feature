Feature: Order online
Scenario: User wants to order food

Given the User is at "Homepage"
When the User clicks on " See Menu and Order"
Then User should  navigate to  "Menu" Options
And  User clicks on particular item 
Then User should able to enter the quantity and hit "AddCart" options 
Then User should able to enter name,mobile no,payment method and hit "Place Order Now" button
Then User should able to see the confirmation page.