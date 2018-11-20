package test.steps.definition.android;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

import com.test.manager.FileReaderManager;
import com.test.pageObject.CalculatorScreen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * Created by ONUR on 03.04.2016.
 */
public class CalculatorStepsUsingPageObject {
 
    WebDriver driver; 
    CalculatorScreen calculator;
    
    @Given("^I connect to calculator on android$")
    public void setUp() throws MalformedURLException{       	
        //Set up desired capabilities and pass the Android app-activity
        //and app-package to Appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", FileReaderManager.getInstance().getConfigReader().getDeviceName());
        capabilities.setCapability("udid", FileReaderManager.getInstance().getConfigReader().getUDID());
        capabilities.setCapability("platformName",FileReaderManager.getInstance().getConfigReader().getPlatformName());
        capabilities.setCapability("platformVersion",FileReaderManager.getInstance().getConfigReader().getPlatforVersion());
        capabilities.setCapability("testName",FileReaderManager.getInstance().getConfigReader().getTestName());
 
        // This package name of your app (you can get it from apk info app)
        capabilities.setCapability("appPackage", FileReaderManager.getInstance().getConfigReader().getAppPackage());
 
        // This is Launcher activity of your app (you can get it from apk info app)
        capabilities.setCapability("appActivity",FileReaderManager.getInstance().getConfigReader().getAppActivity());
 
        //Create RemoteWebDriver instance and connect to the Appium server
        //It will launch the Calculator App in Android Device using the configurations
        //specified in Desired Capabilities
        driver = new RemoteWebDriver(new URL(FileReaderManager.getInstance().getConfigReader().getAppiumServerUrl()), capabilities);          
    }
 
    
    
    @When("^I press on number 2$")
	public void pressFirstNumber(){
    	calculator = new CalculatorScreen(driver);
    	calculator.clickNumber2();
	}
    
    @When("^I press on button plus$")
	public void pressButtonAdd(){
    	calculator.clickPlus();
	}
    
    @When("^I press on number 8$")
	public void pressSecondNumber(){
    	calculator.clickNumber8();
	}
    
    @When("I press on button equal$")
	public void pressButtonEqual(){
    	calculator.clickEqual();
	}
    
    @Then("^I display the Result$")
	public void displayResult(){
    	calculator.showResult();
	}
    
    @Then("^I close the calculator$")
	public void closeCalculator(){
    	 //close the app
        driver.quit();
	}  

}
