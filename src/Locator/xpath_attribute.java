package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_attribute {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("do not login");
	Thread.sleep(3000);
	//driver.findElement(By.className("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(3000);
	String s1=driver.getCurrentUrl();
	System.out.println(s1);
}
}
