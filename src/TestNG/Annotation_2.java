package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_2 
{
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("---close Broswer--", true);
	}
	
@BeforeMethod
public void loginToApp()
{
	Reporter.log("---login to app---",true);
}
	@Test
	public void verifyFN()
	{
		Reporter.log("running verifyFN TC1",true);
	}

	@Test
	public void verifyFN2()
	{
		Reporter.log("running verifyFN2 TC2",true);
	}
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("--logout From App---",true);
	}
	
	
	
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("--open browser--", true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
