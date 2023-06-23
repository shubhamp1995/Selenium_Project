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

public class exa1_getStringdata 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\Book1.xlsx");
//	Workbook book = WorkbookFactory.create(file);
//	Sheet sheet = book.getSheet("Sheet1");
//	Row rw = sheet.getRow(0);
//	Cell c1 = rw.getCell(0);
//	String value = c1.getStringCellValue();
//	System.out.println(value);
	
	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
}
}
