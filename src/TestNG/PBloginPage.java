package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PBloginPage 
{
private WebElement signIn;

PBloginPage(WebDriver driver)
{
	signIn=driver.findElement(By.xpath("//a[text()='Sign in']"));
}
	public void clickPBloginPagesignIn()
	{
	signIn.click();	
	}
}

