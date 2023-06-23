package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup1 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
driver.findElement(By.xpath("//input[@name='submit']")).click();

//switch to alert popup
Alert alt = driver.switchTo().alert();
//gettext from alert popup
String text = alt.getText();
System.out.println(text);
//click on "cancel"btn from alert popup
//alt.dismiss();
//click on "ok" btn from alert popup
alt.accept();
//click on "ok" btn from 2nd alert popup
alt.accept();

}
}
