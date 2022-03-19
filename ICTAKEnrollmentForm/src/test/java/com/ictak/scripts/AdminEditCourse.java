package com.ictak.scripts;
import java.io.IOException;
import org.testng.annotations.Test;
import com.ictak.pages.AdminEditingandUpdatingCourse;
import com.ictak.utilities.ExcelUtility;

public class AdminEditCourse extends TestBase{ 
	AdminEditingandUpdatingCourse objLogin;

	@Test(priority=1)    
	public void verifyAdmincourseEdit() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new AdminEditingandUpdatingCourse(driver);
		
		String email = ExcelUtility.getCellData(6, 0);  
		String password = ExcelUtility.getCellData(6, 1);
		String role= ExcelUtility.getCellData(6, 2);
		String price= ExcelUtility.getCellData(14, 4);
		objLogin.clickLogin();
		objLogin.setEmail(email);
		objLogin.setPassword(password);
		objLogin.setRole(role);
		objLogin.clickSignIn();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		objLogin.clickCourse();		
		objLogin.clickScroll();
		Thread.sleep(2000);
		objLogin.clickEdit();
		objLogin.clearPrice();
		objLogin.setPrice(price);
		objLogin.clickUpdate();
		
		
		
		
	

}
	@Test(priority=2)    
	public void verifyAdmincourseReset() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new AdminEditingandUpdatingCourse(driver);
		
	objLogin.clickReset();
	driver.navigate().back();
		
		
		
	

}
	@Test(priority=3)    
	public void verifyAdmincourseDelete() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new AdminEditingandUpdatingCourse(driver);
		
		
		objLogin.clickScroll();
		Thread.sleep(2000);
		objLogin.clickDelete();
		driver.switchTo().alert().accept();
		
		}



}
