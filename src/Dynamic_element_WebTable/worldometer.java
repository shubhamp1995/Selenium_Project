package Dynamic_element_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class worldometer
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.worldometers.info/");
//String text = driver.findElement(By.xpath("(//div[@class='counterdiv']//span)[2]")).getText();
//System.out.println(text);
String text = driver.findElement(By.xpath("(//div[@class='counterdiv']//div)[10]")).getText();
System.out.println(text);



}
}
