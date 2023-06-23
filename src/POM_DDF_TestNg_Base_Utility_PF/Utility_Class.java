package POM_DDF_TestNg_Base_Utility_PF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v109.css.CSS.TakeCoverageDeltaResponse;

public class Utility_Class 
{
public static String getTestData(int rowIndex ,int ColIndex) throws EncryptedDocumentException, IOException
{
	FileInputStream file =new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet7");
	String value = Sh.getRow(rowIndex).getCell(ColIndex).getStringCellValue();
	
	 return value;
	
	
}
public  static void captureSS(WebDriver driver ,int TCID) throws IOException
{
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
File dest =new File("C:\\Users\\shubham\\Music\\screenshot\\testCaseID"+TCID+".jpg");
org.openqa.selenium.io.FileHandler.copy(src, dest);
}
public static String GetPfData(String key) throws IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\eclipse-workspace\\selenium_proj\\propertyFile.properties");
	Properties p=new Properties();
	p.load(file);
	
	String value = p.getProperty(key);
	return value;
	
}
}
