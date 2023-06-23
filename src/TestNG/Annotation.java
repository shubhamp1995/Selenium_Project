package TestNG;

import org.checkerframework.common.util.report.qual.ReportOverride;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation 
{
	@BeforeMethod
	public void loginapplication()
	{
	Reporter.log("---login to app---",true);	
	}
	
	@Test
public void verifyFullName()
{
Reporter.log("running verify FN TC1",true);	
}
	@Test
public void verifyFullName2()
{
Reporter.log("running verify FN TC2",true);	
}
@AfterMethod
public void logout()
{
	Reporter.log("running logout",true);
}
}
