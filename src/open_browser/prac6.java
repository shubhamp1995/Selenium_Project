package open_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac6 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean result = driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
	System.out.println(result);
	if(result) {
		System.out.println(" is enabled");
	}
	else
	{
		System.out.println("disabled");
	}
}
}
