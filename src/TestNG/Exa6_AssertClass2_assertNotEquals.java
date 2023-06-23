package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exa6_AssertClass2_assertNotEquals 
{
	@Test
public void Tc3()

{
String ActResult="hello";
String ExpResult="hi";
Assert.assertNotEquals(ActResult, ExpResult,"failed: both result are same-");

}
//	@Test
//public void Tc4()
//
//{
//String ActResult="hello";
//String ExpResult="hello";
//Assert.assertNotEquals(ActResult, ExpResult,"failed: both result are same-");
//
//}
}
