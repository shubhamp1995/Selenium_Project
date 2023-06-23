package open_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pra3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.navigate().to("https://www.myntra.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.navigate().refresh();
	//driver.quit();				in between code--> quit methods -->you can't get further operation
	String title=driver.getTitle();
	System.out.println(title);
	Thread.sleep(1000);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
}
}
