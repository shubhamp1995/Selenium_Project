package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getnumvalue 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	System.out.println(value);
	
	
	
	
	
	
	
	
}
}
