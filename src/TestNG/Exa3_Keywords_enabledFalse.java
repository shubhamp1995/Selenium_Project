package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exa3_Keywords_enabledFalse
{
@Test
	public void TC1()
	{
	Reporter.log("running Tc1",true);	
	}
@Test(enabled=false)
public void TC2()
{
Reporter.log("running Tc2",true);	
}
@Test
public void TC3()
{
Reporter.log("running Tc3",true);	
}
	
	
	
	
}
