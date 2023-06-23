package xpath_xpression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_contains_withattribute {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[contains(@placeholder,'name')]")).sendKeys("rahul");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[4]")).sendKeys("thakre");
}
}
