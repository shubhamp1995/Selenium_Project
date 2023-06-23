package MixSection2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_sendkeys2 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
//WebElement UN = driver.findElement(By.xpath("//input[@name='email']"));
Thread.sleep(2000);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementById('email').value='hello';");

js.executeScript("document.getElementById('pass').value='worlds';");


}
}
