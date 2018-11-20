package test.steps.definition.android;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.manager.FileReaderManager;
/**
 * Created by ONUR on 03.04.2016.
 */
public class FirstAppiumAndroidTest {
 
    WebDriver driver;
    
    @BeforeClass
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
 
    @Test
    public void testCal() throws Exception {
        //locate the Text on the calculator by using By.name()
        WebElement two=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02"));
        two.click();
        WebElement plus=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add"));
        plus.click();
        WebElement four=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_08"));
        four.click();
        WebElement equalTo=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
        equalTo.click();
        //locate the edit box of the calculator by using By.tagName()
        WebElement results=driver.findElement(By.className("android.widget.EditText"));
        
        System.out.println("Result = " + results.getText());
        
        //Check the calculated value on the edit box
        assert results.getText().toString().equals("6"):"Actual value is : "
                +results.getText()+" did not match with expected value: 6";        
    }
 
    @AfterClass
    public void teardown(){
        //close the app
        driver.quit();
    }
    
    public static void main(String str[]) throws Exception {
    	FirstAppiumAndroidTest obj = new FirstAppiumAndroidTest();
    	obj.setUp();
    	obj.testCal();
    	obj.teardown();
    }
}
