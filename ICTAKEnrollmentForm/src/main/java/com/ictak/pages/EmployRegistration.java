package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EmployRegistration {
WebDriver driver;
@FindBy(xpath="//a[@href='/login/studentlogin']")
private WebElement login;
	@FindBy(xpath="//strong[contains(text(),' Register as New Employee')]")
	private WebElement employeeregister;
	@FindBy(name="name")
	private WebElement employeename;
	@FindBy(name="email")
	private WebElement employeeemail;
    @FindBy(name="password")
    private WebElement password;
    @FindBy(name="role")
    private WebElement role;
    @FindBy(xpath="//button[@type='submit']")
	private WebElement register;
	
    
    public EmployRegistration(WebDriver driver) {
		this.driver = driver;
	    
	    PageFactory.initElements(driver, this);
	}
          public void clickLogin(){
		  login.click();   
		}  
		 public void clickemployeeregister(){
			 employeeregister.click();   
		}  
		 public void setName(String strEmployeeame){
			    employeename.sendKeys(strEmployeeame);
			 }
		public void setEmail(String strEmployeeemail){
			employeeemail.sendKeys(strEmployeeemail);
			 }
		 public void setPassword(String strPassword){
			    password.sendKeys(strPassword);
			 }
		 public void setRole(String strRole){
			 role.sendKeys(strRole);
			    
			 }
		 public void clickRegister(){
			  register.click(); 
			} 
	

}
