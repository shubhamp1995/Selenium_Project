package MixSection2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authentication_popup 
{

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter the username
	String username = "admin";
	
	//enter the password
	String password = "admin";
	
	
	String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
	driver.get(URL);
	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
}
