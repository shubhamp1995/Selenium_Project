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

public class getstringdata 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
//	Workbook book = WorkbookFactory.create(file);
//	Sheet sh = book.getSheet("Sheet6");
//	Row rw = sh.getRow(5);
//	Cell c1 = rw.getCell(2);
//	String value = c1.getStringCellValue();
//	System.out.println(value);
	String value = WorkbookFactory.create(file).getSheet("Sheet6").getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
	
	
}
}
