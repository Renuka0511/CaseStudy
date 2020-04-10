Feature: Multiple Logins


Scenario Outline: Multiple Valid Login Conditions
Given online demoshop app is open
When Renuka provides multiple valid "<username>" "<password>"
Then she can see the home page with different logins 

Examples:
|username|password|
|rsabe11@gmail.com|Asdfgh|
|rsabe22@gmail.com|Asdfgh|
|rsabe33@gmail.com|Asdfgh|
|rsabe44@gmail.com|Asdfgh|
|rsabe55@gmail.com|Asdfgh|
