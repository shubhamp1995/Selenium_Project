package SimplePOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaTest
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	demoqaLoginPgae login=new demoqaLoginPgae(driver);
	login.EnterUN();
	Thread.sleep(2000);
	login.EnterPwd();
	Thread.sleep(2000);
	login.clickOnLogin();
	Thread.sleep(2000);
	driver.quit();
	
}
}
