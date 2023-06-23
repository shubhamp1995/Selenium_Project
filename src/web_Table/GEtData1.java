package web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GEtData1 
{
public static void main(String[] args)
{
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/web-table-element.php");
String text = driver.findElement(By.xpath("//table[@class='dataTable']//tr[4]/td[1]")).getText();

System.out.println(text);

}
}
