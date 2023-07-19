package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser_testing2 
{
	@Parameters("browserName")
	@Test
	
public void Tc1(String browserName) throws InterruptedException
{
	WebDriver driver=null;
	if(browserName.equals("Chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browserName.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.quit();
	
	
	
}
}
