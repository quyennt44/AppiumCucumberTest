package com.test.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CalculatorScreen {
	
	public CalculatorScreen(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "com.sec.android.app.popupcalculator:id/bt_02") 
	private WebElement buttonNumber2;
	
	@FindBy(how = How.ID, using = "com.sec.android.app.popupcalculator:id/bt_08") 
	private WebElement buttonNumber8;	

	@FindBy(how = How.ID, using = "com.sec.android.app.popupcalculator:id/bt_add") 
	private WebElement buttonPlus;
	
	@FindBy(how = How.ID, using = "com.sec.android.app.popupcalculator:id/bt_equal") 
	private WebElement buttonEqual;
	
	@FindBy(how = How.CLASS_NAME, using = "android.widget.EditText")
	private WebElement textAreaResult;
	
	public void clickNumber2() {
		buttonNumber2.click();
	}
	
	public void clickNumber8() {
		buttonNumber8.click();
	}
	
	public void clickPlus() {
		buttonPlus.click();
	}
	
	public void clickEqual() {
		buttonEqual.click();
	}
	
	public void showResult() {
		System.out.println("Result = " + textAreaResult.getText());
	}
}