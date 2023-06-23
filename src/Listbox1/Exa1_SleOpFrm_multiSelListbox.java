package Listbox1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exa1_SleOpFrm_multiSelListbox 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	Thread.sleep(3000);
	WebElement car = driver.findElement(By.xpath("//select[@id='cars']"));
	
	Thread.sleep(3000);
	
	//driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("Mar");
	//step1:
	//WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	//step2:
	Select s=new Select(car);
	//step3:
	s.selectByVisibleText("Audi");//string
	Thread.sleep(3000);
	s.selectByValue("saab");//string
	Thread.sleep(3000);
	s.selectByIndex(0);
}
}
