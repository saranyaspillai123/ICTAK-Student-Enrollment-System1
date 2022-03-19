package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.Automationconstants;
import com.ictak.pages.EmployRegistration;
import com.ictak.utilities.ExcelUtility;

public class EmployeeRegistration extends TestBase {
EmployRegistration objLogin;
	
	
	@Test(priority=1)    
	public void verifyEmployeeRegistrationPositive() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new  EmployRegistration(driver);
		String employeename = ExcelUtility.getCellData(9, 0);
		String employeeemail = ExcelUtility.getCellData(9, 1);
		String password = ExcelUtility.getCellData(9, 2);
		String role= ExcelUtility.getCellData(9, 3);
		objLogin.clickLogin();
		objLogin.clickemployeeregister();
		objLogin.setName(employeename);
		objLogin.setEmail(employeeemail);
		objLogin.setPassword(password);
		objLogin.setRole(role);
		objLogin.clickRegister();
		Thread.sleep(1000);
		String actual=driver.getCurrentUrl();
		String expected=Automationconstants.url;
		Assert.assertEquals(actual, expected);
		
	}
	@Test(priority=2)    
	public void verifyEmployeeRegistrationNull() throws IOException, InterruptedException  {    
		//Create Login Page object   
		
		objLogin = new  EmployRegistration(driver);
		String employeename = ExcelUtility.getCellData(10, 0);
		String employeeemail = ExcelUtility.getCellData(10, 1);
		String password = ExcelUtility.getCellData(10, 2);
		String role= ExcelUtility.getCellData(10, 3);
		objLogin.clickLogin();
		objLogin.clickemployeeregister();
		objLogin.setName(employeename);
		objLogin.setEmail(employeeemail);
		objLogin.setPassword(password);
		objLogin.setRole(role);
		objLogin.clickRegister();
		String actual=driver.getCurrentUrl();
		String expected=Automationconstants.url2;
		Assert.assertEquals(actual, expected);
	}

}
