package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontainsattribute {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	//enter login id 
	driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("petkar.shubh@gmail.com");
	Thread.sleep(2000);
	//enter a pwd
	driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("password");
	Thread.sleep(2000);
	//login
	driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login')]")).click();
}
}
