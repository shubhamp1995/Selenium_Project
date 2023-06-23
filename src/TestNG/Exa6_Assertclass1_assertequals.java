package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exa6_Assertclass1_assertequals 
{
	@Test
public void Tc1()

{
String ActResult="hello";
String ExpResult="hello";
Assert.assertEquals(ActResult, ExpResult,"failed: both result are diff-");

}
//	@Test
//public void Tc2()
//
//{
//String ActResult="hello";
//String ExpResult="hi";
//Assert.assertEquals(ActResult, ExpResult,"failed: both result are diff-");
//
//}
}
