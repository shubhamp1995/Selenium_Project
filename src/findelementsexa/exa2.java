package findelementsexa;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exa2 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
System.out.println(allcheckbox.size());
//for(WebElement s1:allcheckbox)
//{
//	s1.click();
//	Thread.sleep(500);
//}
for(int i=0;i<=allcheckbox.size()-1;i++)
{
	allcheckbox.get(i).click();
}
for(int i=allcheckbox.size()-1;i>=0;i--)
	
{
	allcheckbox.get(i).click();
}



}
}
