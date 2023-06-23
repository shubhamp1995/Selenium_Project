package ListBox2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class additonal 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(3000);
	List<WebElement> month = driver.findElements(By.xpath("//select[@id='month']"));
	String str[]= {"Mar","June","Aug"};
	for(WebElement s1:month)
	{
		String s2=s1.getText();
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.println(str[i]);
			if(s2.contains(str[i]))
			{
				System.out.println(str[i]+"is present");
			}
			else
			{
				System.out.println("not present");
			}
		}
		
	}
	
	
}
}
