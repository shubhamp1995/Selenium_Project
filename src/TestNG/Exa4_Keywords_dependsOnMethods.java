package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exa4_Keywords_dependsOnMethods 
{

	@Test
	public void login()
	{
		Reporter.log("running tc login",true);
	}
	
	@Test(dependsOnMethods="login")
	public void logout()
	{
		Reporter.log("running tc logout",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
