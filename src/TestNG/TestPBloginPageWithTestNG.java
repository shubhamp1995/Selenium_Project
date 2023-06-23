package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestPBloginPageWithTestNG 
{
@Test
public void m1() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.policybazaar.com/");
	Thread.sleep(2000);
	PBloginPage login=new PBloginPage(driver);
	login.clickPBloginPagesignIn();
	Reporter.log("PBLoginPage signIn Pass",true);
}

}
