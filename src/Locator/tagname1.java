package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname1
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/shubham/Music/dummypage.html");
		//for FN
		driver.findElement(By.tagName("input")).sendKeys("hello");
		//for LN
		driver.findElement(By.tagName("input")).sendKeys("xyz@123");
	}

}