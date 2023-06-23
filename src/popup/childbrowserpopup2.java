package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpopup2 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://skpatro.github.io/demo/links/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//input[@name='NewTab']")).click();
Set<String> id = driver.getWindowHandles();
ArrayList<String> al=new ArrayList<String>(id);
driver.switchTo().window(al.get(1));
driver.findElement(By.xpath("(//span[@class='menu-text'])[1]")).click();
driver.switchTo().window(al.get(0));
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
Set<String> ids = driver.getWindowHandles();
ArrayList<String> all=new ArrayList<String>(ids);
driver.switchTo().window(all.get(2));
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='mobile-navigation']")).click();








}
}
