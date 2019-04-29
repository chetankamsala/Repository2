

Feature: instagram login
  I want to login to my insta account

  
  Scenario: Instagram Login
    Given I want to enter insta url
    And I want to enter username and password
     | username | password | 
     |  name1   | awe@32   | 
     |name2     |   acc@324|    
    When I click on login
   Then Home page is appeared
    

  
    