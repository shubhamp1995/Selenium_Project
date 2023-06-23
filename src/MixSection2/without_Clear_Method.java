package MixSection2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_Clear_Method 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.facebook.com/");
WebElement Ele = driver.findElement(By.xpath("//input[@id='email']"));
Ele.sendKeys("Shubham"+" "+"Petkar");
Thread.sleep(3000);
Ele.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);



}
}
