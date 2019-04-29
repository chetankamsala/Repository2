
Feature: Gmail Login
  

 
  Scenario: Gmail Login
    Given I want to enter gmail url
    And I enter valid username and password
      | username | password | 
      | name1    | pass@123 | 
      | name2    | pass2@321|
    When I click on sigin button
     Then gmail home page is displayed
   

  

    
      
