package com.ictak.scripts;

import java.io.IOException;


import org.testng.annotations.Test;


import com.ictak.pages.StudentOptionalFields;
import com.ictak.utilities.ExcelUtility;

public class StudentOptionalField extends TestBase {
	StudentOptionalFields objLogin;
	
	
	@Test(priority=1)    
	public void verifyStudentQualificationOptional() throws IOException, InterruptedException  {    
		//Create Login Page object   
		objLogin = new StudentOptionalFields(driver);
		
		
		String qualification= ExcelUtility.getCellData(15, 11);
		String employmentstatus= ExcelUtility.getCellData(15, 12);
		String course= ExcelUtility.getCellData(15, 13);
		
		
	objLogin.clickCourses();
	objLogin.clickScroll();
	Thread.sleep(2000);
	objLogin.clickKnowMore();
	objLogin.clickEnroll();
	
	objLogin.setQualification(qualification);
	Thread.sleep(2000);
	objLogin.setEmploymentstatus(employmentstatus);
	Thread.sleep(2000);
	objLogin.setCourse(course);
	
	

	
	
	
	
	
	
	
	
	
	
}
	

}
