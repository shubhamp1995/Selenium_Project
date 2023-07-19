package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exa11_parellel_Execution1 
{
@Test
public void openFacebookApp() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(4000);
	driver.close();
	
}
}
