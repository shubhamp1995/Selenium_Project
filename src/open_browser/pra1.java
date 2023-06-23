package open_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class pra1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	
//	 Options s1=driver.manage();
//	 Window s2=s1.window();
//	s2.maximize();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	Thread.sleep(2000);
	String title=driver.getTitle();
	System.out.println(title);
	Thread.sleep(2000);
	driver.quit();
}
}
