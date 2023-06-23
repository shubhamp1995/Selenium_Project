package web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTExt1 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/webtables");
String text = driver.findElement(By.xpath("(//div[@class='rt-table']//div)[4]")).getText();
System.out.println(text);


}
}
