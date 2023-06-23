package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[contains(@class,'inputtext')]")).sendKeys("abc");
		WebElement UN = driver.findElement(By.xpath("//input[contains(@class,'inputtext')]"));
		UN.sendKeys("abc");
		Thread.sleep(2000);
		UN.clear();
		Thread.sleep(2000);
		UN.sendKeys("xyz");
		
	}
	

}
