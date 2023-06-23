package web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdata 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	String text = driver.findElement(By.xpath("//table[@id='countries']//tr[1]/td[3]")).getText();
	System.out.println(text);
	
	
	
	
}
}
