package Listbox1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple3 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	WebElement car = driver.findElement(By.xpath("//select[@name='cars']"));
	Thread.sleep(3000);
	
	Select s=new Select(car);
	boolean result = s.isMultiple();
	System.out.println(result);
	if(result)
	{
		System.out.println("Listbox is of multi-selectable");
	}
	else
	{
		System.out.println("Listbox is of single-selectable");
	}
}
}
