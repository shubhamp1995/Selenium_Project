package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exa3_withDDF 
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet7");
	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//click on "sign in" btn
driver.findElement(By.xpath("//a[text()='Sign in']")).click();
Thread.sleep(2000);

//enter mobile number
driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
//click in sign with pwd
driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();

//enter a pwd
driver.findElement(By.xpath("//input[@type='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Sign in']")).click();
Thread.sleep(2000);
WebElement myacc = driver.findElement(By.xpath("//div[text()='My Account']"));
//move to myacc element
Actions act=new Actions(driver);
act.moveToElement(myacc).perform();
Thread.sleep(2000);
//click on my profile
driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
//swtich to child browser window 
Set<String> id = driver.getWindowHandles();
ArrayList<String> a1=new ArrayList<String>(id);
driver.switchTo().window(a1.get(1));
String actText = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");

	String expText=sh.getRow(0).getCell(2).getStringCellValue();
	if(actText.equals(expText))
	{
		System.out.println("tc pass");
	}
	else
	{
		System.out.println("tc fail");
	}
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
