package MixSection2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
public void initialised_Brwoser()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
}
