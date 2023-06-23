package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exa5_Keywords_Timeouts 
{
	@Test(timeOut=5000)
public void TC1() throws InterruptedException
{
	Thread.sleep(3000);
Reporter.log("running Tc1",true);	
}
}
