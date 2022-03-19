package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminAddCourse {
	WebDriver driver;
	@FindBy(xpath="//a[@href='/login/studentlogin']")
	private WebElement login;
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(name="role")
	private WebElement role;
	@FindBy(name="sign-in")
	private WebElement signin;
	@FindBy(xpath="//a[@href='/courses']")
	private WebElement course;
	@FindBy(xpath="//span[contains(text(),'Add Course')]")
	private WebElement addcourse;
	@FindBy(name="name")
	private WebElement nameofcourse;
	@FindBy(id="certification")
	private WebElement certification;
	@FindBy(id="code")
	private WebElement code;
	@FindBy(xpath="//*[@id=\"details\"]")
	private WebElement details;
	@FindBy(xpath="//input[@type='number']")
	private WebElement price;
	@FindBy(name="eligibility")
	private WebElement eligibility;
	@FindBy(name="image")
	private WebElement image;//button[@type='submit'];
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	
	public AdminAddCourse(WebDriver driver) {
		this.driver = driver;
	    //this.executor=(JavascriptExecutor)this.driver;
	    PageFactory.initElements(driver, this);
	}
	 public void clickLogin(){
		  login.click();   
		}  
	 public void setEmail(String strEmail){
		    email.sendKeys(strEmail);
		 }
	 public void setPassword(String strPassword){
		    password.sendKeys(strPassword);
		 }
	 public void setRole(String strRole){
		 role.click();
		    Select option=new Select(role);
		    option.selectByVisibleText(strRole);
		 }
	 public void clickSignIn(){
		  signin.click();   
		} 
	 public void clickCourse(){
		  course.click();   
		}
	 public void clickAddCourse(){
		  addcourse.click();   
		}
	 public void setNameofcourse(String strNameofcourse){
		 nameofcourse.sendKeys(strNameofcourse);
		 }
	 public void setCertification(String strCertification){
		    certification.sendKeys(strCertification);
		 }
	 public void setCode(String strCode){
		    code.sendKeys(strCode);
		 }
	 public void setDetails(String strDetails){
		    details.sendKeys(strDetails);
		 }
	 public void setPrice(String strPrice){
		    price.sendKeys(strPrice);
		 }
	 public void setEligibility(String strEligibility){
		    eligibility.sendKeys(strEligibility);
		 }
	 public void setImage(String strImage){
		    image.sendKeys(strImage);
		 }
	 public void clickSubmit(){
		  submit.click();   
		}
	 






}
