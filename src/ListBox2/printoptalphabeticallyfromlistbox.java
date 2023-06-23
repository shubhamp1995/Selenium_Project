package ListBox2;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printoptalphabeticallyfromlistbox 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(5000);
	WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	Select s=new Select(month);
	List<WebElement> opt = s.getOptions();
	
	TreeSet ts=new TreeSet();
	for(WebElement s1:opt)
	{
		String data = s1.getText();
		ts.add(data);
	}
//	for(Object k:ts)
//	{
//		System.out.println(k);
//	}
	System.out.println(ts);
}
}
