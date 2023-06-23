package xpath_xpression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_index1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8973263263");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("xyz123");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//option[@value='27']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//select[@title='Month']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//option[text()='Jun']")).click();
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("")).click();
}
}

