package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Exa7_SoftAssertClass1
{	
	
	@Test
	public void TC5() 
	{
		SoftAssert soft=new SoftAssert();
		
		String actResult="hello";
		String expResult="hhi";
		soft.assertEquals(actResult, expResult,"Failed1: both results are diff- ");    
		
		
		boolean actResult1 = true;		
		soft.assertTrue(actResult1,"Failed2: act result is false- ");
		soft.assertAll();
		
	}

}
