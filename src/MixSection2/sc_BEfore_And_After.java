package MixSection2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class sc_BEfore_And_After
{
public static void main(String[] args) throws IOException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\shubham\\Pictures\\abc.jpg");
	FileHandler.copy(sc, dest);
	WebElement tag = driver.findElement(By.tagName("select"));
	Select s=new Select(tag);
	s.selectByValue("IND");
	File sc1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest1=new File("C:\\Users\\shubham\\Pictures\\abc1.jpg");
	FileHandler.copy(sc1, dest1);
	
}
}
