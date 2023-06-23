package ListBox2;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getsizeofListBox 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("Mar");
	//step1:
	WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	//step2:
	Select s=new Select(month);
//	int size = s.getOptions().size();
//	System.out.println(size);
//	
	List<WebElement> alloption = s.getOptions();
	int size = alloption.size();
	System.out.println(size);
	
	for(WebElement s1:alloption)
	{
		System.out.println(s1.getText());
	}
	TreeSet<String> ts=new TreeSet<String>();
	for(WebElement s1:alloption)
	{
		ts.add(s1.getText());
	}
	System.out.println(ts);
	for(String k:ts)
	{
		System.out.println(k);
	}
}
}
