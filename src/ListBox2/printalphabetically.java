package ListBox2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printalphabetically 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(5000);
	WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	Select s=new Select(month);
	List s2=new ArrayList();
	List<WebElement> opt = s.getOptions();
	
	
	for(WebElement s1:opt)
	{
		s2.add(s1.getText());
	}
//	for(Object k:ts)
//	{
//		System.out.println(k);
//	}
	Collections.sort(s2);
	System.out.println(s2);
	for(Object k:s2)
		{
			System.out.println(k);
		}
	
}
}
