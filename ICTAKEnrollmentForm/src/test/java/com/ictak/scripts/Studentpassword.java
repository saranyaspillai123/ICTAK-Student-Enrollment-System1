package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.Automationconstants;
import com.ictak.pages.StudentPasswordvalidation;
import com.ictak.utilities.ExcelUtility;

public class Studentpassword extends TestBase {
StudentPasswordvalidation objLogin;
	
	
	@Test(priority=1)    
	public void verifyStudentRegistrationPasswordPositive() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new  StudentPasswordvalidation(driver);
		String password = ExcelUtility.getCellData(7, 0);
		objLogin.clickCourses();
		objLogin.clickScroll();
		objLogin.clickKnowMore();
		objLogin.clickEnroll();
		objLogin.setPassword(password);
			
	}
	@Test(priority=2)    
	public void verifyStudentRegistrationPasswordNegative1() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new  StudentPasswordvalidation(driver);
		String password = ExcelUtility.getCellData(7, 1);
		objLogin.clearPassword();
		objLogin.setPassword(password);
		String expectedMessage =Automationconstants.PASSWORD_ERROR_MESSAGE;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
		
		
      
		
		
	}
	@Test(priority=3)    
	public void verifyStudentRegistrationPasswordNegative2() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new  StudentPasswordvalidation(driver);
		String password = ExcelUtility.getCellData(7, 2);
		
		objLogin.clearPassword();
		objLogin.setPassword(password);
		//Thread.sleep(2000);
		String expectedMessage =Automationconstants.PASSWORD_ERROR_MESSAGE;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
		
		
      
		
		
	}
	@Test(priority=4)    
	public void verifyStudentRegistrationPasswordNegative3() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new  StudentPasswordvalidation(driver);
		String password = ExcelUtility.getCellData(7, 3);
		objLogin.clearPassword();
		objLogin.setPassword(password);
		
		String expectedMessage =Automationconstants.PASSWORD_ERROR_MESSAGE;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
		
		
       
		
		
	}
	@Test(priority=5)    
	public void verifyStudentRegistrationPasswordNegative4() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new  StudentPasswordvalidation(driver);
		String password = ExcelUtility.getCellData(7, 4);
		objLogin.clearPassword();
		objLogin.setPassword(password);
		String expectedMessage =Automationconstants.PASSWORD_ERROR_MESSAGE;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
		
		
		
	}

}
