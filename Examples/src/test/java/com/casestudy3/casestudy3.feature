
Feature: Title of your feature
  I want to use this template for my feature file

 
  Scenario: Title of your scenario
     Given Alex instances the web driver to open browser
    And He opens the app by using testmeapp url 
    And He enters the valid admin credentials and clicks on login button
      | name  | pwd | 
      | Admin | password456 | 
      And adds category
      |Category name  | Category description |
      |CATEGORIES|product with awesome bass|
      And adds subcategory
      |cat|sub|abc|
      |CATEGORIES|HEADPHONES|product with good bass|
      And adds product
      | a        | b      | c   | d | e   | f                     |
      |CATEGORIES|jabra 11| $300|10 |jabra|used for office purpose|
      And cliks on add product
      And signout from the app and close the browser

 