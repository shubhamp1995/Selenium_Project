package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("11");
driver.findElement(By.xpath("//input[@name='submit']")).click();

//1.get text from alert popup
String text = driver.switchTo().alert().getText();
System.out.println(text);

//click on cancel btn from alert popup
//driver.switchTo().alert().dismiss();
//click on "ok" btn from 1st alert popup
driver.switchTo().alert().accept();
//click on "ok" btn from 2nd alert popup
driver.switchTo().alert().accept();


}
}
