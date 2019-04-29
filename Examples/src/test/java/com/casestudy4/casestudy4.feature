
Feature: Title of your feature
  

 
  

 
  Scenario: Title of your scenario outline
    
    Given Admin enters username and password in testme app
      | username  | password | 
      | Admin | password456 | 
      And Admin clicks on login button
      And adds category
      |cat name   |cat desp|    |cate name  |sub cate name|sub cate desp       |category name|product name |price|quantity|brand|description|
      |SPORTSfifa10|Outdoor game10|SPORTSfifa10|outdoor10     |10used for outdoor games|SPORTSfifa10|VOLLEY BALL7|3000|20|Reebok|used for outdoor| 
      |SPORTSfifa20|Outdoor game20|SPORTSfifa20|outdoor20     |20used for outdoor games|SPORTSfifa20|Basket BALL7|4000|20|Reebok|used for outdoor|
      #And adds sub-category
      #|cate name|sub cate name|sub cate desp|
      #|SPORTSfifa1|outdoor1|1used for outdoor games|
      #|SPORTSfifa2|outdoor2|2used for outdoor games|
      #And adds product
      #|category name| 
      #|SPORTSfifa1| 
      #|SPORTSfifa2|
    
      
      
      
    
      #And adds price,quantity,brand,description
     #|product name |price|quantity|brand|description|
      #|VOLLEY BALL|3000|20|Reebok|used for outdoor|
      #|Basket BALL|4000|20|Reebok|used for outdoor|
      
      #And clicks on add product
     And signout from the app
      
      
      
      
      
