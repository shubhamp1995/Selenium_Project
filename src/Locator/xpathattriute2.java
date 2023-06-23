package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathattriute2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//driver.findElement(By.cssSelector("//textarea[@id='APjFqb']")).sendKeys("print hello word");
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("apple series 6 watch");
	
}
}
