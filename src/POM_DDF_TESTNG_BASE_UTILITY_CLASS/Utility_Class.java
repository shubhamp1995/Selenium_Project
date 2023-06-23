package POM_DDF_TESTNG_BASE_UTILITY_CLASS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class 
{
public static String getTestData(int rowIndex ,int ColIndex) throws EncryptedDocumentException, IOException
{
	FileInputStream file =new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet7");
	String value = Sh.getRow(rowIndex).getCell(ColIndex).getStringCellValue();
	
	 return value;
	
	
}
}
