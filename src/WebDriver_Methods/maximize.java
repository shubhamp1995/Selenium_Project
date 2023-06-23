package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
//	Options s1 = driver.manage();
//	Window s2 = s1.window();
//	s2.maximize();
	Thread.sleep(2000);
	String url = driver.getCurrentUrl();
	System.out.println(url);
}
}