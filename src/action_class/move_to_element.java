package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class move_to_element 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
Actions act=new Actions(driver);
act.moveToElement(login).perform();
driver.findElement(By.xpath("//div[text()='Wishlist']")).click();

}
}
