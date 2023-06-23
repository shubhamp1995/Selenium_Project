package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exa6_AssertClass1_assertrue 
{
	@Test
	
public void Tc1()
{
boolean ActResult = true;	
Assert.assertTrue(ActResult,"Failed:Actual Result is false");
}
//	@Test
//	
//public void Tc2()
//{
//boolean ActResult = false;	
//Assert.assertTrue(ActResult,"Failed:Actual Result is false");
//}
}
