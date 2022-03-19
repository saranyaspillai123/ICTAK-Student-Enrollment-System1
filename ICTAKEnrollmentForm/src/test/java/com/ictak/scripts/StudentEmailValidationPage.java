package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.Automationconstants;
import com.ictak.pages.StudentEmailValidation;
import com.ictak.utilities.ExcelUtility;

public class StudentEmailValidationPage extends TestBase {
	 StudentEmailValidation objLogin;
	
	
	@Test(priority=1)    
	public void verifyStudentRegistrationEmailPositive() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new  StudentEmailValidation(driver);
		String email = ExcelUtility.getCellData(3, 1);
		objLogin.clickCourses();
		objLogin.clickScroll();
		objLogin.clickKnowMore();
		objLogin.clickEnroll();
		objLogin.setEmail(email);
		
		
		
	}
	@Test(priority=2)    
	public void verifyStudentRegistrationEmailValidationNegative() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new  StudentEmailValidation(driver);
		String email = ExcelUtility.getCellData(4,1);
		objLogin.clearEmail();
		objLogin.setEmail(email);
		String expectedMessage =Automationconstants.EMAIL_ERROR_MESSAGE;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
			
	}

}

