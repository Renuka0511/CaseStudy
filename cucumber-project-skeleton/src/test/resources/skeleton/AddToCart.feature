@RunWith(Cucumber.class)
Feature: Search And Add To Cart

Scenario: The one whrer user select different product through search functionality
Given: Renuka has registered in testmeapp
When: Renuka searches bellow option in search box:
|Head|
|Travel|
|Laptop|
Then: prodct should be added in the cart if available

