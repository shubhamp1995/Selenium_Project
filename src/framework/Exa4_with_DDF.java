package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exa4_with_DDF 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
{
FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");	
Sheet sh = WorkbookFactory.create(file).getSheet("Sheet7");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//enter UN
driver.findElement(By.xpath("//input[@placeholder='UserName']")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
Thread.sleep(2000);
//enter pwd
driver.findElement(By.xpath("//input[@type='password']")).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());
Thread.sleep(2000);
((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
Thread.sleep(2000);
//login
driver.findElement(By.xpath("//button[text()='Login']")).click();
Thread.sleep(2000);
//scrolldown
WebElement del = driver.findElement(By.xpath("(//button[text()='Delete All Books'])[1]"));
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", del);
//click on go to book store
driver.findElement(By.xpath("//button[text()='Go To Book Store']")).click();
Thread.sleep(2000);
((JavascriptExecutor)driver).executeScript("window.scrollBy(0,150)");
Thread.sleep(2000);
//click on any book
driver.findElement(By.xpath("//a[text()='Learning JavaScript Design Patterns']")).click();
Thread.sleep(2000);
//add to collection
WebElement collection = driver.findElement(By.xpath("//button[text()='Add To Your Collection']"));
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", collection);
driver.findElement(By.xpath("//button[text()='Add To Your Collection']")).click();
Thread.sleep(2000);
//handle alert popup
Alert alt = driver.switchTo().alert();
String text = alt.getText();
System.out.println(text);
alt.accept();
//click on profile btn
driver.findElement(By.xpath("//span[text()='Profile']")).click();
Thread.sleep(2000);
//scrolldown
WebElement dacc = driver.findElement(By.xpath("//button[text()='Delete Account']"));
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", dacc);
Thread.sleep(2000);
//clcik on delete all books
driver.findElement(By.xpath("(//button[text()='Delete All Books'])[1]")).click();
//handled popup
driver.findElement(By.xpath("//button[text()='OK']")).click();
Thread.sleep(2000);
Alert alt1 = driver.switchTo().alert();
alt1.accept();
Thread.sleep(2000);

//scrollup
WebElement search = driver.findElement(By.xpath("//input[@placeholder='Type to search']"));
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", search);

Thread.sleep(2000);
//click on logout
driver.findElement(By.xpath("//button[text()='Log out']")).click();





}
}
