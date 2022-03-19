package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StudentPayment {
WebDriver driver;
	
	@FindBy(xpath="//a[@href='/courses']")
	private WebElement courses;
	@FindBy(xpath="//div[@class='team-hover']")
	private WebElement scroll;
	
	@FindBy(xpath="//a[contains(text(),'Know More')]")
	private WebElement knowmore;
	@FindBy(xpath="//a[contains(text(),'Enroll Now')]")
	private WebElement enroll;
	@FindBy(xpath="/html/body/app-root/app-registerform/div/form/div/div[1]/input")
	private WebElement name;
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(name="phone")
	private WebElement phone;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(name="district")
	private WebElement district;
	@FindBy(name="state")
	private WebElement state;
	@FindBy(xpath="//select[@formcontrolname='qualification']")
	private WebElement qualification;
	@FindBy(name="passout")
	private WebElement passout;
	@FindBy(name="skills")
	private WebElement skills;
	@FindBy(name="employmentStatus")
	private WebElement employmentstatus;
	@FindBy(name="techtraining")
	private WebElement techtraining;
	@FindBy(name="course")
	private WebElement course;

	@FindBy(name="image")
	private WebElement image;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement register;
	
	
	
	
	public StudentPayment(WebDriver driver) {
		this.driver = driver;
	    
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
		 public void setName(String strName){
			    name.sendKeys(strName);
			 }
		public void setEmail(String strEmail){
			    email.sendKeys(strEmail);
			 }
		 public void setPassword(String strPassword){
			    password.sendKeys(strPassword);
			 }
		 
		 public void setPhone(String strPhone){
			    phone.sendKeys(strPhone);
			 }
		 public void setAddress(String strAddress){
			    address.sendKeys(strAddress);
			 }
		 public void setDistrict(String strDistrict){
			    district.sendKeys(strDistrict);
			 }
		 public void setState(String strState){
			    state.sendKeys(strState);
			 }
		
		 public void setQualification(String strQualification){
			    qualification.click();
			    Select option=new Select(qualification);
			    option.selectByVisibleText(strQualification);
			 }
		 public void setPassout(String strPassout){
			    passout.sendKeys(strPassout);
			 }
		 public void setSkills(String strSkills){
			    skills.sendKeys(strSkills);
			 }
		 public void setEmploymentstatus(String strEmploymentstatus){
			 employmentstatus.click();
			    Select option1=new Select(employmentstatus);
			    option1.selectByVisibleText(strEmploymentstatus);
			 }
		 
		 public void setTechtraining(String strTechtraining){
			 techtraining.sendKeys(strTechtraining);
			 }
		
		 public void setCourse(String strCourse){
			course.click();
			    Select option2=new Select(course);
			    option2.selectByVisibleText(strCourse);
			 }
		
		 public void setImage(String strImage){
			 image.sendKeys(strImage);
			 }
		 public void clickRegister(){
			  register.click(); 
			} 
		

}
