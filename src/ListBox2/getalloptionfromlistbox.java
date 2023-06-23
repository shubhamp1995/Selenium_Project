package ListBox2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getalloptionfromlistbox 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("Mar");
	//step1:
	WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	//step2:
	Select s=new Select(month);
	List<WebElement> alloption = s.getOptions();
	System.out.println(alloption.size());
	for(WebElement s1:alloption)
	{
		System.out.println(s1.getText());
	}
}
}
