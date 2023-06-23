package xpath_xpression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribute2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shubham");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shubha123");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[@role='link']")).click();
	//driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
	String text = driver.findElement(By.xpath("//a[text()='Forgot password?']")).getText();
	System.out.println(text);
}
}
