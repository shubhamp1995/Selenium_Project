package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
	System.out.println(result);
	if(result)
	{
		System.out.println(" button is enabled");
	}
	else
	{
		System.out.println("button is  disabled");
		
	}
	driver.navigate().to("https://www.instagram.com/");
	Thread.sleep(4000);
	boolean rs = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).isEnabled();
	System.out.println(rs);
	if(rs)
	{
		System.out.println(" button is enabled");
	}
	else
	{
		System.out.println("button is  disabled");
		
	}
}
}