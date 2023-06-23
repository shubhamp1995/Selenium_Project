package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowsertesting3
{
	@Parameters("Browsername")
	@Test
public void browserTesting(String Browsername) throws InterruptedException 
{
	WebDriver driver=null;
	if(Browsername.equals("Chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(Browsername.equals("Firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if (Browsername.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	else if (Browsername.equals("safari"))
	{
		driver=new SafariDriver();
	}
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
}
}
