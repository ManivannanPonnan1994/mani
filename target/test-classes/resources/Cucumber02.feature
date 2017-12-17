Feature: Accessing the dashboard


Background: test background
Given I am a valid user on the web page


#@tag2
#Scenario: Login
#Given I am a valid user on the web page
#When I enter the username as "natarajan.ramanathan93@gmail.com"
#And I enter the password as "Welcome123"
#When I click on the SignIn button
#Then I should be navigated to dashboard

@tag3 @smoke
Scenario Outline: Login
#Given I am a valid user on the web page
When I enter the username as <username>
And I enter the password as <password>
When I click on the SignIn button
Then I should be navigated to dashboard

Examples:
|username|password|
|nat|pwd1|
|daisy|pwd2|

@tag4 @smoke
Scenario: Insurance Records
Given I am able to access the dashboard
When I enter the insurance records
|name|email|Phone|address|age|
|a|a|a|a|a|
|abv|alu|agh|ath|afgd|
And I post it
Then I should be able to retrieve the data fom DB