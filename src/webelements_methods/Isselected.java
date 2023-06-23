package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(4000);
	boolean result = driver.findElement(By.xpath("//input[@class='_8esa']")).isSelected();
	System.out.println(result);
	if(result)
	{
		System.out.println("radiobtn is selected");
	}
	else
	{
		System.out.println("radiobtn is deselected");
	}
}
}
