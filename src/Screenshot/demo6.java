package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class demo6 
{
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://paytm.com/recharge");
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	String rs = RandomString.make(2);
	File dest=new File("C:\\Users\\shubham\\Music\\screenshot\\iamge"+rs+".png");
	FileHandler.copy(src, dest);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_11kC  _15qf _2qE6']")).click();
	File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	String rs1 = RandomString.make(2);
	File dest1=new File("C:\\Users\\shubham\\Music\\screenshot\\iamge"+rs1+".png");
	FileHandler.copy(src1, dest1);
}
}
