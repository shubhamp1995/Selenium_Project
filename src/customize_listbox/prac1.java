package customize_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prac1 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
	Actions act=new Actions(driver);
	act.click(year).perform();
	Thread.sleep(2000);
	//navigate 3 option to bottom using arrow down
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	//navigate 1 to top using arraow up
	act.sendKeys(Keys.ARROW_UP).perform();
	
	
	
}
}
