Feature: Registration to TestmeApp

Scenario Outline: peeter will register to testmeapp
Given peeter is On The Registration Page
When  peeter gives The Correct Credentials "<uname>" "<fname>" "<lname>" "<pwd>" "<cpwd>" "<email>" "<phno>" "<add>" "<ans>" 
Then  peeter Rendered To TestMeApp Login Page
 
 Examples:
 |uname|fname|lname|pass|cpass|email|phno|add|ans|
 |peeter05|mandy|peeter|peeter123|peeter123|peeterm@gmail.com|012345678|asd fgh|coco|
