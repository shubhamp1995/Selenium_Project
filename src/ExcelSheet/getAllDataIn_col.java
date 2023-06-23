package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataIn_col 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	int lastrow = sh.getLastRowNum();
	
	for(int i=0; i<=lastrow;i++)
	{
		String value = sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println(value);
	}
	
	
	
	
	
}
}
