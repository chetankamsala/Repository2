
Feature: Scenarios based on tags.....

  @sanity
  Scenario: ajay login
    Given user enters "ajay" as input
    And enters password as "asd@123" in the field
    When he clicks on login button
    Then home page is appeared
 
    @smoke
    Scenario: Password change
    Given user enters new password
    And user re enters new password
    When he confirms the password entered
    Then updated password
    
    @smoke1 @sanity 
    Scenario: Password change
    Given user enters new password
    And user re enters new password
    When he confirms the password entered
    Then updated password

  