package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_3 
{
	@BeforeClass
	public void FirstExe()
	{
	Reporter.log("---FirstExecuton",true);	
	}
	
	@BeforeMethod
	public void precondition() 
	{
	Reporter.log("--precond--",true);	
	}
	
	@Test
public void tc1() 
{
Reporter.log("running tc1",true);	
}
	@Test
public void tc2() 
{
Reporter.log("running tc2",true);	
}
	@AfterMethod
	public void PostCondition()
	{
	Reporter.log("---postCond--",true);	
	}
	@AfterMethod
	public void PostConditionwwwww()
	{
	Reporter.log("---postCond22--",true);	
	}
	@AfterClass
	public void LastExe()
	{
		Reporter.log("--LastExecution---",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
