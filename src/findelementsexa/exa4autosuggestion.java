package findelementsexa;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exa4autosuggestion
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.google.com/");

driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
Thread.sleep(2000);
List<WebElement> alloption = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
String expText="redmi 12c";

for(WebElement s1:alloption)
{
	String acttext = s1.getText();
	if(acttext.equals(expText))
	{
	s1.click();
	break;
}
}





}
}
