package POM_DDF_TESTNG_BASE_UTILITY_CLASS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
WebDriver driver;
public void InitializedBrowser()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
}
