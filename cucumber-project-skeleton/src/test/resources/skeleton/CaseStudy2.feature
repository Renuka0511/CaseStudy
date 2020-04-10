Feature: CaseStudy Login

In this CaseStudy we are going to Login in TestMeApp
 
 Scenario Outline: peeter will login successfully 
 Given peeter open the login page
 When  peeter Provides The Correct Credentials "<uname>" "<pass>"
 Then  peeter login To TestMeApp Home Page
 
 Examples:
 |uname|pass|
 |Lalitha|Password123|