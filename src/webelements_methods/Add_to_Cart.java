package webelements_methods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_to_Cart 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	
	
	driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("boat watch");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[contains(text(),'boAt Wave Call Smart Watch')]")).click();
Thread.sleep(10000);
//get window id
Set<String> id = driver.getWindowHandles();
ArrayList<String> a1=new ArrayList<String>(id);
//swtich to child window
driver.switchTo().window(a1.get(1));
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
}
}
