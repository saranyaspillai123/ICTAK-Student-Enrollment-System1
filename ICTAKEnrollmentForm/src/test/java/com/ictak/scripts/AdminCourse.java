package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ictak.constants.Automationconstants;
import com.ictak.pages.AdminCoursePage;
import com.ictak.utilities.ExcelUtility;

public class AdminCourse extends TestBase {
	AdminCoursePage objLogin;

	@Test(priority=1)    
	public void verifyAdmincourseepage() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new AdminCoursePage(driver);
		
		String email = ExcelUtility.getCellData(6, 0);  
		String password = ExcelUtility.getCellData(6, 1);
		String role= ExcelUtility.getCellData(6, 2);
		objLogin.clickLogin();
		objLogin.setEmail(email);
		objLogin.setPassword(password);
		objLogin.setRole(role);
		objLogin.clickSignIn();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		objLogin.clickCourse();
		String actual=driver.getCurrentUrl();
		String expected=Automationconstants.COURSE;
		Assert.assertEquals(actual, expected);
		
		
	

}

	@Test(priority=2)    
	public void verifyAdminSpecificcourse() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new AdminCoursePage(driver);
		objLogin.clickScroll();
		objLogin.clickKnowMore();
		String actual=driver.getCurrentUrl();
		String expected=Automationconstants.Know_More;
		Assert.assertEquals(actual, expected);
		

}

}
