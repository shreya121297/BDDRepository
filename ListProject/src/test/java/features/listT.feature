
Feature: One column data table

 
  Scenario: Sum of items price
    Given a list of prices
    |4|
    |5|
    |7|
    
  
    When I summarize them
    Then I should get 0
   
