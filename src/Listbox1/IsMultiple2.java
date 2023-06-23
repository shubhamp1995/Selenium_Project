package Listbox1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple2 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	WebElement menu = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	Select s=new Select(menu);
	boolean result = s.isMultiple();
	System.out.println(result);
	if(result)
	{
		System.out.println("list box is of multi-selectable");
	}
	else
	{
		System.out.println("list box is of single-selectable");
	}
}
}
