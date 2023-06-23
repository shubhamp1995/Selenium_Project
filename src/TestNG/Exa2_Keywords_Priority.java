package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exa2_Keywords_Priority 
{
 @Test							//By default=0
	public void TC4()
	{
		Reporter.log("-running Tc4--",true);
	}
 @Test(priority=2)
	public void TC2()
	{
		Reporter.log("-running Tc2--",true);
	}
	
 @Test(priority=1)
	public void TC3()
	{
		Reporter.log("-running Tc3--",true);
	}
	
 @Test(priority=3)
	public void TC1()
	{
		Reporter.log("-running Tc1--",true);
	}
	
	
	
	
	
	
	
	
	
}
