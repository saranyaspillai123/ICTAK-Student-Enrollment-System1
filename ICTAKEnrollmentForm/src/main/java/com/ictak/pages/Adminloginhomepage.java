package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adminloginhomepage {
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
	@FindBy(xpath="//a[@routerlink='home']")
	private WebElement home;
	@FindBy(xpath="//div[@class='team-hover']")
	private WebElement scroll;
	
	@FindBy(xpath="//a[contains(text(),'Know More')]")
	private WebElement knowmore;
	
	
	public Adminloginhomepage(WebDriver driver) {
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
	 public void clickHome(){
		  home.click();   
		} 
	 public void clickScroll(){
		 Actions action=new Actions(driver);
		 action.moveToElement(scroll).perform();
		    
		}  
	 public void clicknowMore(){
		  knowmore.click();   
		} 
 

}
