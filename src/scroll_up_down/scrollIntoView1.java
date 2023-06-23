package scroll_up_down;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView1 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
//	WebElement ele = driver.findElement(By.xpath("//h2[text()='What Can You Buy From Flipkart?']"));
//	Thread.sleep(2000);
//	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ele);
	Thread.sleep(2000);
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
//	WebElement ele2 = driver.findElement(By.xpath("//span[text()='Help Center']"));
//	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ele2);
	Thread.sleep(2000);
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1000)");
	
	
	
	
}
}
