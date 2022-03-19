package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.Automationconstants;
import com.ictak.pages.StudentPayment;
import com.ictak.utilities.ExcelUtility;

public class Studentpayment1 extends TestBase {
	StudentPayment objLogin;
	
	
	@Test(priority=1)    
	public void verifyStudentRegistrationPositive() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new StudentPayment(driver);
		
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

}
