package Listbox1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exa2_DselAllOpFrm_MultiSelListBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement car = driver.findElement(By.xpath("//select[@id='cars']"));
		Thread.sleep(2000);
		Select s=new Select(car);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("saab");
		Thread.sleep(2000);
		s.selectByVisibleText("Audi");
		
		Thread.sleep(4000);
		
		s.deselectAll();
		
	}

}
