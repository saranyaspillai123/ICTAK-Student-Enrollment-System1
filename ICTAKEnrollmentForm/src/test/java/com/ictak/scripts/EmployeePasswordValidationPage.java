package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.Automationconstants;

import com.ictak.pages.EmployeePasswordValidation;
import com.ictak.utilities.ExcelUtility;

public class EmployeePasswordValidationPage extends TestBase {
	EmployeePasswordValidation objLogin;
	
	
	@Test(priority=1)    
	public void verifyEmployeePasswordPositive() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new EmployeePasswordValidation(driver);
		String password = ExcelUtility.getCellData(12, 0);
		objLogin.clickLogin();
		objLogin.clickemployeeregister();
		objLogin.setPassword(password);
		
		
		
		
	}
	@Test(priority=2)    
	public void verifyEmployeePasswordNegative1() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new EmployeePasswordValidation(driver);
		String password = ExcelUtility.getCellData(12, 1);
		objLogin.clearPassword();
		objLogin.setPassword(password);
		String expectedMessage =Automationconstants.PASSWORD_ERROR_MESSAGE1;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
			
	}
	@Test(priority=3)    
	public void verifyEmployeePasswordNegative2() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new EmployeePasswordValidation(driver);
		String password = ExcelUtility.getCellData(12, 2);
		objLogin.clearPassword();
		objLogin.setPassword(password);
		String expectedMessage =Automationconstants.PASSWORD_ERROR_MESSAGE1;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
			
	}
	@Test(priority=4)    
	public void verifyEmployeePasswordNegative3() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new EmployeePasswordValidation(driver);
		String password = ExcelUtility.getCellData(12, 3);
		objLogin.clearPassword();
		objLogin.setPassword(password);
		String expectedMessage =Automationconstants.PASSWORD_ERROR_MESSAGE1;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
			
	}
	@Test(priority=5)    
	public void verifyEmployeePasswordNegative4() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new EmployeePasswordValidation(driver);
		String password = ExcelUtility.getCellData(12, 4);
		objLogin.clearPassword();
		objLogin.setPassword(password);
		String expectedMessage =Automationconstants.PASSWORD_ERROR_MESSAGE1;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
			
	}


}
