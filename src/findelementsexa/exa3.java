package findelementsexa;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exa3 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//a[text()='Create new account']")).click();
List<WebElement> combo = driver.findElements(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg']"));
System.out.println(combo.size());
for(WebElement s2:combo)
{
	String text = s2.getText();
	System.out.println(text);
}





}
}
