package ExcelSheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mock 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(5000);
WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
Select s=new Select(month);

//s.selectByIndex(11);
//Thread.sleep(2000);

//s.selectByValue("2");
//Thread.sleep(2000);
//s.selectByVisibleText("Mar");
}
}
