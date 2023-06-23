package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_left_clcik 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
Actions act=new Actions(driver);
//act.moveToElement(cart).perform();
//act.click().perform();
act.click(cart).perform();
}
}
