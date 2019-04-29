
Feature: Multiple Scenario
  


  Scenario Outline: Multiple users login
    Given user enter "<user_id>" in the field
    And user enters the "<password>" in the field
    When user clicks on login button
    Then he navigates to home page

    Examples: 
      | user_id  | password | 
      | miller   |  asd@345 | 
      | shyam    |  sdf@df7 | 
      | jack     |  ter@335 | 
      | joe      |  asf@3s7 | 
