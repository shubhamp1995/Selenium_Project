package scroll_up_down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupdown 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//scroll down:->1st paramter :0 and 2nd paramter :+ve
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	Thread.sleep(2000);
	//scroll up:->1st paramter :0 and 2nd paramter :-ve
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-350)");
	
//	//scroll right:->1st paramter :+ve and 2nd paramter :0
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");
//		
//	//scroll left:->1st paramter :-ve and 2nd paramter :0
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(-50,0)");
//	
	
}
}
