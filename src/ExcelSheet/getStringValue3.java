package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getStringValue3 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	String value = WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
	
//	Workbook book = WorkbookFactory.create(file);
//	Sheet sh = book.getSheet("Sheet1");
//	Row rw = sh.getRow(1);
//	Cell c1 = rw.getCell(0);
//	String v = c1.getStringCellValue();
//	System.out.println(v);
	
	
	
	
	
	
}
}
