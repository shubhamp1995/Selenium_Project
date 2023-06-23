package findelementsexa;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exa5autosuggestion 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("samsung");
Thread.sleep(2000);
List<WebElement> alloption = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
String exptext="samsung s23 ultra";
for(WebElement s1:alloption)
{
	String actText=s1.getText();
//	System.out.println(actText);
	if(actText.equals(exptext))
	{
		s1.click();
		break;
	}
}

}
}
