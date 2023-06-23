package POM_DDF_TestNg_Base_Utility_PF;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
WebDriver driver;
public void InitializedBrowser() throws IOException
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(Utility_Class.GetPfData("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
}
