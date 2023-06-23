package ListBox2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getsleopfrm_single_seleListbox 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(5000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select s=new Select(month);
	String text = s.getFirstSelectedOption().getText();
	System.out.println(text);
//	WebElement getoption = s.getFirstSelectedOption();
//	String text = getoption.getText();
//	System.out.println(text);

}
}
