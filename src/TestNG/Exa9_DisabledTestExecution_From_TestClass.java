package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exa9_DisabledTestExecution_From_TestClass 
{
@Test
	public void Tc1() 
	{
	Reporter.log("running TC1",true);	
	}
@Test
public void Tc2() 
{
Reporter.log("running TC2",true);	
}
@Test(enabled=false)
public void Tc3() 
{
Reporter.log("running TC3",true);	
}	
@Test
public void Tc4() 
{
Reporter.log("running TC4",true);	
}	
@Test
public void Tc5() 
{
Reporter.log("running TC5",true);	
}	
	
	
}
