package web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcolsize_in_row 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/web-table-element.php");
int colsize = driver.findElements(By.xpath("//table[@class='dataTable']//tr[3]/td")).size();

System.out.println(colsize);



}
}
