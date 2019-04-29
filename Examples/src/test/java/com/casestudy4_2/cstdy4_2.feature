Feature: Title of your feature
 Scenario: Title of your scenario outline
    
    Given Admin enters username and password in testme app
      | username  | password    | 
      | Admin     | password456 | 
      And Admin clicks on login button
      Scenario Outline: And adds categor "<cat name>" , "<cat desp>" , "<cate name>" , "<sub cate name>" , "<sub cate desp>" , "<category name>" , "<product name>" , "<price>" , "<quantity>" , "<brand>" , "<description>"  
      Examples: |cat name    |cat desp      | #cate name   |sub cate name  |sub cate desp |category name|product name |price|quantity|brand |description     |   
                |SPORTSfifa10|Outdoor game10|#SPORTSfifa10|outdoor10     |20used for outdoor games|SPORTSfifa10 |VoLlEy BALL7 |4000 |20      |Reebok|used for outdoor|
                |SPORTSfifa20|Outdoor game20|#SPORTSfifa20|outdoor20     |10used for outdoor games|SPORTSfifa20 |BaSkEt BALL7 |4000 |20      |Reebok|used for outdoor|
     
    # Scenario Outline: And adds sub category "<cate name>" , "<sub cate name>" , "<sub cate desp>" 
   Examples: |cate name   |sub cate name  |sub cate desp |      
              |SPORTSfifa10|outdoor10     |20used for outdoor games|
             |SPORTSfifa20|outdoor20     |10used for outdoor games|
     
    #Scenario Outline: And adds products "<category name>" , "<product name>" , "<price>" , "<quantity>" , "<brand>" , "<description>" 
    Examples: |category name|product name |price|quantity|brand |description     |
               |SPORTSfifa10 |VoLlEy BALL7 |4000 |20      |Reebok|used for outdoor|
               |SPORTSfifa20 |BaSkEt BALL7 |4000 |20      |Reebok|used for outdoor|
     