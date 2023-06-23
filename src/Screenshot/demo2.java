package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class demo2 
{
public static void main(String[] args) throws IOException 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
System.out.println(src);

String rs = RandomString.make(3);

File dest=new File("C:\\Users\\shubham\\Pictures\\Screenshots\\Image"+rs+".jpg");
FileHandler.copy(src, dest);



}
}
