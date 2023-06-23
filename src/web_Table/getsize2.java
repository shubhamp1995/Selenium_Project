package web_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize2 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/webtables");
//	int size = driver.findElements(By.xpath("//div[@class='rt-table']//div[@class='rt-resizable-header-content']")).size();
//	
//	System.out.println(size);
	
 List<WebElement> ele = driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
	
	int size = ele.size();
	System.out.println(size);
	System.out.println("===================");
	for(WebElement s1:ele)
	{
		String s2 = s1.getText();
		System.out.println(s2);
	}
	
	
	
}
}
