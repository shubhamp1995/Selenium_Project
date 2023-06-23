package web_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRowSize 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	 int size = allrows.size();
	System.out.println(size);
	
	
	
	
	
	
}
}
