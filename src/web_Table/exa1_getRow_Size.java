package web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exa1_getRow_Size 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/web-table-element.php");
int size = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();

System.out.println(size);
}
}
