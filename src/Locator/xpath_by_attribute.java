package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribute {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//enter user name
	//driver.findelement("locator type")
	//driver.findelement(by.xpath("xpathExpression"));
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("609093392039");
	Thread.sleep(3000);
	// enter password
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
}

}
