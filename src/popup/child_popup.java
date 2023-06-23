package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_popup 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("https://skpatro.github.io/demo/links/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//click on "new tab" from main page
driver.findElement(By.xpath("//input[@name='NewTab']")).click();
//get child window id 

Set<String> allid = driver.getWindowHandles();
ArrayList<String> ar=new ArrayList<String>(allid);
String childpopup = ar.get(1);
//swtich focus to child window
driver.switchTo().window(childpopup);

//click on"training "link from childwindow

driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();










}
}
