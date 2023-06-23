package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exa6_AssertClass1_assertFalse 
{
	@Test
public void Tc1()
{
boolean ActResult = true;	

Assert.assertFalse(ActResult,"failed: ActResult is true");
}
	
	
	
	
	
}
