package open_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pra2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
  driver.manage().window().maximize();
   String url=driver.getCurrentUrl();
	System.out.println(url);
	Thread.sleep(1000);
	 String title=driver.getTitle();
		System.out.println(title);
}
}
