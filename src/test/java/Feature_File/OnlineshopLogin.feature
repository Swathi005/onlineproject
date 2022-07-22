@swathi 
Feature: Login feature for online project website

Background: 
 Given The user is on the application home page
 When User click on the sign in option
 
 @swathi1
 Scenario Outline: Sigin the online website
 And Enter the login details "<username>" and "<password>"
 Then click the sign in button

 Examples: 
 |username|password|
 |shopping5678@gmail.com|shopping@123$|
 
 @swathi2
Scenario: Invalid
 And Enter the login details "shopping5678@gmail.com" and "shoppping@123$"
 Then click the sign in button
 And the user should not alow to login
 
 
 