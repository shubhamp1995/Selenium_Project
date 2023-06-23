package xpath_xpression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_index {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8973263263");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("xyz123");
	
}
}
