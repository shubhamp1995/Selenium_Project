package MixSection2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twoValuesFrom_Excel_toEle 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	//Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	String value = sh.getRow(0).getCell(0).getStringCellValue();
	String value1 = sh.getRow(0).getCell(1).getStringCellValue();

//for(int i=0;i<=1;i++)
//{
//	String value = sh.getRow(0).getCell(i).getStringCellValue();
//	System.out.print(value+" ");
//}

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(value+" "+value1);
	
	
	
	
	
}

private static Object getRow(int i) {
	// TODO Auto-generated method stub
	return null;
}
}
