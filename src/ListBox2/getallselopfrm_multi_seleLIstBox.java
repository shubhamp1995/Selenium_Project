package ListBox2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getallselopfrm_multi_seleLIstBox

{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	WebElement car = driver.findElement(By.xpath("//select[@name='cars']"));
	Thread.sleep(3000);
	
	Select s=new Select(car);
	s.selectByIndex(3);
	Thread.sleep(2000);
	s.selectByValue("saab");
	Thread.sleep(2000);
	s.selectByVisibleText("Volvo");
	Thread.sleep(3000);
	
	List<WebElement> allselectedoptions = s.getAllSelectedOptions();
	System.out.println(allselectedoptions.size());
	for(WebElement s1:allselectedoptions)
	{
		System.out.println(s1.getText());
	}
}
}