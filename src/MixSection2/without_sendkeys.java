package MixSection2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_sendkeys 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
WebElement text = driver.findElement(By.xpath("//input[@id='email']"));


//send hello
JavascriptExecutor js=(JavascriptExecutor)driver; 
js.executeScript("arguments[0].value='hello';", text);
Thread.sleep(2000);

//clear hello
JavascriptExecutor js1=(JavascriptExecutor)driver; 
js1.executeScript("arguments[0].value='';", text);
Thread.sleep(2000);

//password
WebElement text1 = driver.findElement(By.xpath("//input[@type='password']"));


js.executeScript("arguments[0].value='worlds';",text1);





}
}
