package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_class
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/shubham/Music/dummypage.html");
		//for FN
		driver.findElement(By.className("abc123")).sendKeys("hello");
		//for LN
		driver.findElement(By.className("abc123")).sendKeys("xyz@123");
	}

}