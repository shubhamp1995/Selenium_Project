package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exa1_Keywords_invocation 
{
	@Test(invocationCount=3)
public void TC1() 
{
Reporter.log("--running TC1---",true);	
}
}
