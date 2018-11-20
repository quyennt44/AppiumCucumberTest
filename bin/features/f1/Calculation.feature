Feature: Calculation 
  I do some calculation with two numbers 
	Scenario: multiply a and b 
	  Given I have variable a 
	  And I have variable b 
      When I multiplication a and b 
      Then I display the Result
      
     Scenario: divive a and b
      Given I have int variable a1 
	  And I have int variable b1 
      When I devide a1 and b1 
      Then I display the divive Result
      