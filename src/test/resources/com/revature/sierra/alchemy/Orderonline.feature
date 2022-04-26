Feature: Order online
Scenario: User wants to order food

Given the User is at "Homepage"
When  User clicks on " See Menu and Order"
And  User navigate to  "Menu" Options
And  User clicks on particular item 
And  User enters the quantity and hit "AddCart" options 
And User enters name,mobile no,payment method and hit "Place Order Now" button
Then User can see the confirmation page.