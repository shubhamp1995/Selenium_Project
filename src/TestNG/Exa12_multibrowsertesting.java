package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Exa12_multibrowsertesting
{
@Parameters("browserName")
@Test
public void Tc1(String browserName) throws InterruptedException
{
	WebDriver driver=null;
	if(browserName.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
}
