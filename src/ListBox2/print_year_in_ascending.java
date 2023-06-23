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

public class print_year_in_ascending 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(5000);
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select s=new Select(year);
TreeSet ts =new TreeSet();
	List<WebElement> opt = s.getOptions();
	for(WebElement s1:opt)
	{
		ts.add(s1.getText());
	}
	System.out.println(ts);
//	for(Object k:ts)
//	{
//		System.out.println(k);
//	}
	
	
}
}
