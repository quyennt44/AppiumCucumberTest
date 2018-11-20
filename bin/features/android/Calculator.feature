Feature: Calculation 
  I do some calculation with two numbers on android mobile
	Scenario: Add two numbers
	  Given I connect to calculator on android	  
      When I press on number 2
      And I press on button plus
      And I press on number 8
      And I press on button equal
      Then I display the Result  
      And I close the calculator