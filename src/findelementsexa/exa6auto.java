package findelementsexa;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exa6auto 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(3000);
	List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));
	TreeSet ts=new TreeSet();
	for(WebElement s1:months)
	{
		String data = s1.getText();
		System.out.println(data);
		ts.add(data);
	}
	System.out.println(ts);
}
}
