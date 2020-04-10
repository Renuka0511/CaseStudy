 Feature: CaseStudy Cart

In this CaseStudy we are going to test Product Cart in TestMeApp
 
 Scenario: The one where the user moves to cart without adding any item in it 
 Given peeter provide correct login credentials and TestMeApp home page open 
 When  peeter Search a particular product like headphones
 And   try to proceed to payment by adding item in cart
 Then  TestMeApp display the cart icon
   