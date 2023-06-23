package MixSection2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class_sendkeys 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
Actions act=new Actions(driver);
act.moveToElement(un).click().perform();
act.sendKeys("hello").perform();






}
}
