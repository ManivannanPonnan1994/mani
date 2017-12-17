Feature: Accessing the Dashboard
This feature works on the scenario of refunding the money
If there is a proper purchase of product and the refund is valid
//anything given within this description will be diplayed in the report document
#this line will be ignored and will not be reported 

@tag1 @smoke
Scenario: Accessing with a valid user name and password

Given I am a registered on the web page 
When I update my user credentials
When I click on Login
Then I should get access to the Dashboard

@tag2 @smoke
Scenario: Accessing with an invalid username

Given Im not a registered user on the web page
When I update my user credentials
And I click on Login 
Then I should get an error message
