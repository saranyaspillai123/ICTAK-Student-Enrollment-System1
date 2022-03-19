package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.Automationconstants;
import com.ictak.pages.EmployeeEmailValidation;
import com.ictak.utilities.ExcelUtility;

public class EmployeeEmailValidationPage extends TestBase {
EmployeeEmailValidation objLogin;
	
	
	@Test(priority=1)    
	public void verifyEmployeeEmailPositive() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new EmployeeEmailValidation(driver);
		String employeeemail = ExcelUtility.getCellData(11, 0);
		objLogin.clickLogin();
		objLogin.clickemployeeregister();
		objLogin.setEmail(employeeemail);
		
		
		
		
	}
	@Test(priority=2)    
	public void verifyEmployeeEmailNegative() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new  EmployeeEmailValidation(driver);
		String employeeemail = ExcelUtility.getCellData(11,1);
		objLogin.clearEmail();
		objLogin.setEmail(employeeemail);;
		String expectedMessage =Automationconstants.EMAIL_ERROR_MESSAGE;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
			
	}

}
