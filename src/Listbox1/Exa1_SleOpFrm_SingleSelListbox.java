package Listbox1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exa1_SleOpFrm_SingleSelListbox 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("Mar");
	//step1:
	WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	//step2:
	Select s=new Select(month);
	//step3:
	s.selectByVisibleText("Aug");//string
	Thread.sleep(3000);
	s.selectByValue("6");//string
	Thread.sleep(3000);
	s.selectByIndex(11);
}
}
