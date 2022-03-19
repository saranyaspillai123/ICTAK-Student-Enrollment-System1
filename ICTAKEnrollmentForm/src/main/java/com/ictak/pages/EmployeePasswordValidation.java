package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePasswordValidation {
	WebDriver driver;
	@FindBy(xpath="//a[@href='/login/studentlogin']")
	private WebElement login;
		@FindBy(xpath="//strong[contains(text(),' Register as New Employee')]")
		private WebElement employeeregister;
		@FindBy(name="password")
	    private WebElement password;
		@FindBy(xpath="//span[@style='color: red; margin-top: -2%;']")
		private WebElement errorMessage;
public EmployeePasswordValidation(WebDriver driver) {
			this.driver = driver;
		    
		    PageFactory.initElements(driver, this);
		}
	          public void clickLogin(){
			  login.click();   
			}  
	  		public void setPassword(String strPassword){
				password.sendKeys(strPassword);
				 }
			 public void clickemployeeregister(){
				 employeeregister.click();   
			}  
			 public String getErrorMessage() {
				 return errorMessage.getText();
				 
			 }
			 public void clearPassword(){
				 password.clear();
				 }


}
