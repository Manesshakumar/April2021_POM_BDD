Feature: LoginPage Test

Background:
Given user is on accountLogin Page


Scenario: Login Title Check
Then user verify the title of the Page as "Login - My Store"

Scenario: Forgot Password Link Check
Then user verify the forgot password link is available

Scenario: login Validation with correct credentials
Then user enters emailId as "manisha2021@gmail.com"
And User enters password as "Test@12345"
And user clicks on Login button
Then user gets the title of the home page
And page title should be "My account - My Store"