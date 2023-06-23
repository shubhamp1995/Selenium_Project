package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exa4_Keywords_dependsOnMethods2 
{

	@Test
	public void login1()
	{
		Reporter.log("running tc login",true);
	}
	@Test
	public void login2()
	{
		Reporter.log("running tc login",true);
	}
	@Test(dependsOnMethods= {"login1","login2"})
	public void logout()
	{
		Reporter.log("running tc logout",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
