@LoginFeature
Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
	| Username   | Password |
	| tester_quyen01 | test1234 |
	
	Then Message displayed Login Successfully
	

Scenario: Successful LogOut	
	When User LogOut from the Application
	Then Message displayed Logout_Successfully