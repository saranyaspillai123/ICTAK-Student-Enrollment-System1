package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeEmailValidation {
	WebDriver driver;
	@FindBy(xpath="//a[@href='/login/studentlogin']")
	private WebElement login;
		@FindBy(xpath="//strong[contains(text(),' Register as New Employee')]")
		private WebElement employeeregister;
		@FindBy(name="email")
		private WebElement employeeemail;
		@FindBy(xpath="//span[contains(text(),'Email is not valid')]")
		private WebElement errorMessage;
public EmployeeEmailValidation(WebDriver driver) {
			this.driver = driver;
		    
		    PageFactory.initElements(driver, this);
		}
	          public void clickLogin(){
			  login.click();   
			}  
	  		public void setEmail(String strEmployeeemail){
				employeeemail.sendKeys(strEmployeeemail);
				 }
			 public void clickemployeeregister(){
				 employeeregister.click();   
			}  
			 public String getErrorMessage() {
				 return errorMessage.getText();
				 
			 }
			 public void clearEmail(){
				 employeeemail.clear();
				 }

}
