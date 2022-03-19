package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminEditingandUpdatingCourse {
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
	@FindBy(xpath="//*[@id=\"courses\"]/div/div/div[148]/div[1]/img")
	private WebElement scroll;
	@FindBy(xpath="//*[@id=\"courses\"]/div/div/div[148]/div[1]/div/div/button[2]/a")
	private WebElement edit;
	@FindBy(xpath="//input[@type='number']")
	private WebElement price;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement update;
	@FindBy(xpath="//button[@type='reset']")
	private WebElement reset;
	@FindBy(xpath="//*[@id=\"courses\"]/div/div/div[148]/div[1]/div/div/button[3]")
	private WebElement delete;
	
	public  AdminEditingandUpdatingCourse(WebDriver driver) {
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
	 public void clickScroll(){
		 Actions action=new Actions(driver);
		 action.moveToElement(scroll).perform();
		    
		}  
	 public void clickEdit(){
		  edit.click();  
		} 
	 
	 public void setPrice(String strPrice){
		    price.sendKeys(strPrice);
		 }
	 public void clearPrice(){
		  price.clear();  
		} 
	 
	 public void clickUpdate(){
		  update.click();   
		}
	 public void clickReset(){
		  reset.click();   
		}
	 public void clickDelete(){
		  delete.click();   
		}
	 

}
