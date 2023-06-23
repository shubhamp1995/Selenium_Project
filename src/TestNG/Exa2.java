package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exa2 
{
@Test

public void m2() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hello");
	Thread.sleep(2000);
	String text = driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
	System.out.println(text);
	System.out.println("Test Case pass");
}





}
