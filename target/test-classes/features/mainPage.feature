Feature: Login in application

Background:
Given Initialize WebDriver
When Open webpage and go to sign in page

@SmokeTest
Scenario: Login with valid credentials
Then User login with valid username and password
Then User is on main page and account is active

@RegTest
Scenario: Login with valid username and unvalid password
Then User login with valid username and unvalid password
Then Unvalid password error is displayed

