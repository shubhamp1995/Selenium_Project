package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_window
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://skpatro.github.io/demo/links/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//click on "new tab" from main page 
driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();

//get child window id
Set<String> id = driver.getWindowHandles();
ArrayList<String> a1=new ArrayList<String>(id);
String childpopup = a1.get(1);
//switch focus to child window
driver.switchTo().window(childpopup);
//click on "training btn" from child window
driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();




}
}
