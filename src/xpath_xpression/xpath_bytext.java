package xpath_xpression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_bytext {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	String text = driver.findElement(By.xpath("//a[text()='Create new account']")).getText();
	System.out.println(text);
}
}
