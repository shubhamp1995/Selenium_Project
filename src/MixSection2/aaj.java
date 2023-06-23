package MixSection2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aaj 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	//Set the username
	String username = "admin";
	
	//Set the password
	String password = "admin";
	 driver.get("http://the-internet.herokuapp.com/basic_auth");
	
	String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
	
	Thread.sleep(5000);
	driver.get(URL);
//driver.switchTo().alert().sendKeys(username);

	
	
	

}


}

