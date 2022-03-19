package com.ictak.scripts;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.Automationconstants;
import com.ictak.pages.RegisterAsNewStudent;
import com.ictak.utilities.ExcelUtility;
public class Registerasnewstudentpage extends TestBase {
	RegisterAsNewStudent objLogin;
	
	
	@Test(priority=1)    
	public void verifyStudentRegistrationPositive() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new RegisterAsNewStudent(driver);
		
		String name = ExcelUtility.getCellData(0, 0);  
		String email = ExcelUtility.getCellData(0, 1);
		String password = ExcelUtility.getCellData(0, 2);
		String phone = ExcelUtility.getCellData(0, 3);
		String address = ExcelUtility.getCellData(0, 4);
		String district = ExcelUtility.getCellData(0, 5);
		String state = ExcelUtility.getCellData(0, 6);
		String passout = ExcelUtility.getCellData(0, 7);
		String skills = ExcelUtility.getCellData(0, 8);
		String techtraining= ExcelUtility.getCellData(0, 9);
		String image= ExcelUtility.getCellData(0, 10);
		String qualification= ExcelUtility.getCellData(0, 11);
		String employmentstatus= ExcelUtility.getCellData(0, 12);
		String course= ExcelUtility.getCellData(0, 13);
	
		
	objLogin.clickCourses();
	objLogin.clickScroll();
	objLogin.clickKnowMore();
	objLogin.clickEnroll();
	objLogin.setName(name);
	objLogin.setEmail(email);
	objLogin.setPassword(password);
	objLogin.setPhone(phone);
	objLogin.setAddress(address);
	objLogin.setDistrict(district);
	objLogin.setState(state);
	objLogin.setQualification(qualification);
	objLogin.setPassout(passout);
	objLogin.setSkills(skills);
	objLogin.setEmploymentstatus(employmentstatus);
	objLogin.setTechtraining(techtraining);
	objLogin.setCourse(course);
	objLogin.setImage(image);
	objLogin.clickRegister();
	Thread.sleep(5000);
	String actual=driver.getCurrentUrl();
	String expected=Automationconstants.url;
	Assert.assertEquals(actual, expected);
	Thread.sleep(1000);
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	
	
	
	
	
}

//FAILURE
@Test(priority=2)    
public void verifyStudentRegistrationCourseNegative() throws IOException, InterruptedException  {    
	//Create Login Page object   
	objLogin = new RegisterAsNewStudent(driver);
	
	String name = ExcelUtility.getCellData(1, 0);  
	String email = ExcelUtility.getCellData(1, 1);
	String password = ExcelUtility.getCellData(1, 2);
	String phone = ExcelUtility.getCellData(1, 3);
	String address = ExcelUtility.getCellData(1, 4);
	String district = ExcelUtility.getCellData(1, 5);
	String state = ExcelUtility.getCellData(1, 6);
	String passout = ExcelUtility.getCellData(1, 7);
	String skills = ExcelUtility.getCellData(1, 8);
	String techtraining= ExcelUtility.getCellData(1, 9);
	String image= ExcelUtility.getCellData(1, 10);
	String qualification= ExcelUtility.getCellData(1, 11);
	String employmentstatus= ExcelUtility.getCellData(1, 12);
	String course= ExcelUtility.getCellData(1, 13);

	
objLogin.clickCourses();
objLogin.clickScroll();
objLogin.clickKnowMore();
objLogin.clickEnroll();
objLogin.setName(name);
objLogin.setEmail(email);
objLogin.setPassword(password);
objLogin.setPhone(phone);
objLogin.setAddress(address);
objLogin.setDistrict(district);
objLogin.setState(state);
objLogin.setQualification(qualification);
objLogin.setPassout(passout);
objLogin.setSkills(skills);
objLogin.setEmploymentstatus(employmentstatus);
objLogin.setTechtraining(techtraining);
objLogin.setCourse(course);
objLogin.setImage(image);
objLogin.clickRegister();
Thread.sleep(2000);
String actual1=driver.getCurrentUrl();
String expected1=Automationconstants.url1;
Assert.assertEquals(actual1, expected1);

Thread.sleep(1000);
driver.navigate().refresh();
driver.navigate().back();
driver.navigate().back();
driver.navigate().back();



}


@Test(priority=3)    
public void verifyStudentRegistrationNegative() throws IOException, InterruptedException  {    
	//Create Login Page object   
	objLogin = new RegisterAsNewStudent(driver);
	
	String name = ExcelUtility.getCellData(3, 0);  
	String email = ExcelUtility.getCellData(3, 1);
	String password = ExcelUtility.getCellData(3, 2);
	String phone = ExcelUtility.getCellData(3, 3);
	String address = ExcelUtility.getCellData(3, 4);
	String district = ExcelUtility.getCellData(3, 5);
	String state = ExcelUtility.getCellData(3, 6);
	String passout = ExcelUtility.getCellData(3, 7);
	String skills = ExcelUtility.getCellData(3, 8);
	String techtraining= ExcelUtility.getCellData(3, 9);
	String image= ExcelUtility.getCellData(3, 10);
	String qualification= ExcelUtility.getCellData(3, 11);
	String employmentstatus= ExcelUtility.getCellData(3, 12);
	String course= ExcelUtility.getCellData(3, 13);

	
objLogin.clickCourses();
objLogin.clickScroll();
objLogin.clickKnowMore();
objLogin.clickEnroll();
objLogin.setName(name);
objLogin.setEmail(email);
objLogin.setPassword(password);
objLogin.setPhone(phone);
objLogin.setAddress(address);
objLogin.setDistrict(district);
objLogin.setState(state);
objLogin.setQualification(qualification);
objLogin.setPassout(passout);
objLogin.setSkills(skills);
objLogin.setEmploymentstatus(employmentstatus);
objLogin.setTechtraining(techtraining);
objLogin.setCourse(course);
objLogin.setImage(image);
objLogin.clickRegister();
Thread.sleep(3000);
String actual1=driver.getCurrentUrl();
String expected1=Automationconstants.url1;
Assert.assertEquals(actual1, expected1);
Thread.sleep(3000);
driver.navigate().refresh();



}

}
