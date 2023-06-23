package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_popup 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://skpatro.github.io/demo/links/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//input[@name='NewTab']")).click();

//get child window id
Set<String> id = driver.getWindowHandles();
ArrayList<String> a1=new ArrayList<String>(id);
//switch to child window
driver.switchTo().window(a1.get(1));
//click on"training btn" from child window
driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
Thread.sleep(3000);
driver.switchTo().window(a1.get(0));
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
Set<String> ids = driver.getWindowHandles();
ArrayList<String> a2=new ArrayList<String>(ids);

driver.switchTo().window(a2.get(2));
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='mobile-navigation']")).click();



}
}
