

Feature: Adding product to the cart
  
  
  Scenario: Payment Process
     Given Larry instances the web driver to open browser
    And Larry opens the app by using testmeapp url 
    And Larry enters the valid credentials and clicks on login button
      | name  | pwd | 
      | lalitha | password123     | 
    
    And Home page is displayed and Larry cliks on desired Product
    And Larry clicks on Add to cart and proceeds to pay
    And Larry selects the desired bank for payment
    And Larry proceeds for payment and signout from the app
