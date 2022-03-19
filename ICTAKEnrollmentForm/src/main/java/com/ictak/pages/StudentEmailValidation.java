package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentEmailValidation {
	WebDriver driver;
	//JavascriptExecutor executor;
	@FindBy(xpath="//a[@href='/courses']")
	private WebElement courses;
	@FindBy(xpath="//div[@class='team-hover']")
	private WebElement scroll;
	
	@FindBy(xpath="//a[contains(text(),'Know More')]")
	private WebElement knowmore;
	@FindBy(xpath="//a[contains(text(),'Enroll Now')]")
	private WebElement enroll;
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	@FindBy(xpath="//span[contains(text(),'Email is not valid')]")
	private WebElement errorMessage;
	public StudentEmailValidation(WebDriver driver) {
		this.driver = driver;
	    //this.executor=(JavascriptExecutor)this.driver;
	    PageFactory.initElements(driver, this);
	}
	 public void clickCourses(){
		  courses.click();   
		}  
		 public void clickScroll(){
			 Actions action=new Actions(driver);
			 action.moveToElement(scroll).perform();
			  //scroll.click();   
			}  
		 public void clickKnowMore(){
			  knowmore.click();  
			} 
		 public void clickEnroll(){
			  enroll.click(); 
			} 
		 public void setEmail(String strEmail){
			    email.sendKeys(strEmail);
			 }
		 public String getErrorMessage() {
			 return errorMessage.getText();
			 
		 }
		 public void clearEmail(){
			 email.clear();
			 }
}
