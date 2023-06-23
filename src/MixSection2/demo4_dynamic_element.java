package MixSection2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4_dynamic_element 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/feed/trending?bp=6gQJRkVleHBsb3Jl");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement title = driver.findElement(By.xpath("((//div[@id='dismissible'])[3]//div)[3]"));

String text = title.getText();
System.out.println(text);





}
}
