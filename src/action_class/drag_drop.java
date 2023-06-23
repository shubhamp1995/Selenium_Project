package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(2000);
	WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[5]"));
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	//act.moveToElement(src).clickAndHold().moveToElement(dest).release().perform();
	act.dragAndDrop(src, dest).perform();

	
}
}
