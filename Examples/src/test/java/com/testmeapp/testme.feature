
Feature: TestMeApp-Add to Cart
  
 
  Scenario: Adding the Product to the Cart
    Given Tester creates WebDriver Instance
    And opens the url
    And enters the credentials and login
      | name    | pwd        | 
      | lalitha | password123| 
 	  And enter value in search and click find details button
 	  Then add the product to cart and checkout
 	  Then proceed to payment
  	And signout from the TestMeApp