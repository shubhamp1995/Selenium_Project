package scroll_up_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollintoview 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	 WebElement terms = driver.findElement(By.xpath("//a[text()='Terms']"));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",terms);
		Thread.sleep(2000);
	  WebElement text = driver.findElement(By.xpath("//input[@id='email']"));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",text);
	
	
	
	
	
}
}
