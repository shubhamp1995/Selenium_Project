package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontainstext {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	//forgotten pwd link
	driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
}
}
