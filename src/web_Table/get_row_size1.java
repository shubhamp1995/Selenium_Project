package web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_row_size1 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	int size = driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
	System.out.println(size);
	
	
	
}
}
