package xpath_xpression;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribue1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nagpur");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("pune");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='db'])[3]")).click();
	driver.findElement(By.xpath("//td[@class='next']")).click();
	driver.findElement(By.xpath("(//td[@class='wd day'])[3]")).click();
	
}
}
