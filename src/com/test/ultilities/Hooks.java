package com.test.ultilities;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before(order=1)
    public void beforeScenario(){
        System.out.println("Start the browser and Clear the cookies");
    }	
	@Before(order=0)
    public void beforeScenarioStart(){
        System.out.println("-----------------Start of Scenario-----------------");
    }	
	
	
	@After(order=0)
    public void afterScenarioFinish(){
        System.out.println("-----------------End of Scenario-----------------");
    }	
	@After(order=1)
    public void afterScenario(){
        System.out.println("Log out the user and close the browser");
    }
	
	@After("@LoginFeature")
    public void quitDriver(WebDriver driver){
		driver.quit();
        System.out.println("-----------------End of Scenario-----------------");
    }	

}
