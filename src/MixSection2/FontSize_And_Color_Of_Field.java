package MixSection2;

import java.time.Duration;

import org.checkerframework.common.util.report.qual.ReportReadWrite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FontSize_And_Color_Of_Field extends BaseClass
{
//WebDriver driver=new ChromeDriver();
	@BeforeClass
	public void OpenApp()
	{
		initialised_Brwoser();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void login() throws InterruptedException 
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	}
	@Test
public void verifyFontAndColor() throws InterruptedException 
{
		Thread.sleep(4000);	
		WebElement errormsg = driver.findElement(By.xpath("(//span[@id='error-sign-in'])[2]"));
		String fontsize = errormsg.getCssValue("font-size");
		String fontweight = errormsg.getCssValue("font-weight");
		String Text = errormsg.getText();
		String color = errormsg.getCssValue("color");
	String code = Color.fromString(color).asHex();
	
	Reporter.log("error msg====>"+Text);
	System.out.println(code);
	if(code.equals("#de350b"))
	{
		Reporter.log("Red in Color");
	}
	else
	{
		Reporter.log("not red In Color");
	}
	Reporter.log("size of the font is:"+fontsize);
	Reporter.log("weight of the font is:"+fontweight);
}	
	
	
	
	
	
	
	
	
	
}
