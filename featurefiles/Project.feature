Feature: As a user i want to order the food

@case1
Scenario: The user gives the invalid username and password
Given To launch the browser
When The user hit the testing site
And User click the account button
And User pass the wrong username 
And User pass the wrong password
And User click the login button
And User checking result

@case2
Scenario: The user successfully add the dosa

Given To launch the web browser
When To hit the website
And User hit the dosa icon
And User then click the Masal dosa
And User checking the available time


@case3
Scenario: The user fills out the registration form and ignores the confirm password
Given  launching the web browser
When To hit the testing website
And I click the account button
And User pass the Name
And User pass the Mail
And User pass the Phnno
And User pass the Password
And User click the register button
Then User Get the Pop Up

@case4
Scenario: The user search for the “Coke” can and check the price
Given  User launching the web browser
When User enters the testing website
And Click the search icon
And Search the Coke
Then check the price 

@case5
Scenario: The user selects the Spanish Omelet
Given  User launching the Chrome web browser
When User hits the testing website
And Click the search icon
And Search the Spanish Omelte
And Click the Spanish Omelte
And Check the price before probability
And Select and get the toppings option by probability
Then Check the price after probability




