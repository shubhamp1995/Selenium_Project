package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected2 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(4000);
	WebElement radiobtn = driver.findElement(By.xpath("//input[@class='_8esa']"));
	radiobtn.click();
	boolean result = radiobtn.isSelected();
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
