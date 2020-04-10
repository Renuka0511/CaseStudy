Feature: Sign-Up

@smoke
Scenario: Successfull Sign-up

Given I have chosen to sign up
When  I sign up with "<username>" and "<password>"
Then  I should see a personalized greeting message
Examples: 
|username|password|
|rsabe11@gmail.com|Asdfgh|

@sanity
Scenario: Successful password change
Given I entered olpassword
When  I entered newpassword and confirm password
Then  I can see personalized greeting message
