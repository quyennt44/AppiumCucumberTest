package test.steps.definition.f1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Calculation {
	int a;
	int b;
	int result;
		
	@Given("^I have variable a$")
	public int initA() {
		a = 50;
		return a;
	}

	@Given("^I have variable b$")
	public int initB() {
		b = 80;
		return b;
	}

	@When("^I multiplication a and b$")
	public int multiplication() {
		result = a*b;
		return result;
	}

	@Then("^I display the Result$")
	public void printResult() {
		System.out.println("Multiplication of " + a + " and " + b + " is = " + result);
	}
	
	@Given("^I have int variable a1$")
	public int initA1() {
		a = 90;
		return a;
	}

	@Given("^I have int variable b1$")
	public int initB1() {
		b = 10;
		return b;	
	}
	
	@When("^I devide a1 and b1$")
	public int devide() {
		result = a/b;
		return result;
	}

	@Then("^I display the divive Result$")
	public void printDevideResult() {
		System.out.println("Devide of " + a + " and " + b + " is = " + devide());
	}	
	
}
