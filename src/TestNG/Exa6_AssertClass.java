package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exa6_AssertClass
{	
	
	@Test
	public void TC5() 
	{
		String actResult="hello";
		String expResult="hello";
		Assert.assertEquals(actResult, expResult,"Failed1: both results are diff- ");    
		
		
		boolean actResult1 = false;		
		Assert.assertTrue(actResult1,"Failed2: act result is false- ");
	}

}
