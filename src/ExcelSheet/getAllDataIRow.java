package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataIRow 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	int cellindex = sh.getRow(0).getLastCellNum()-1;
	for(int i=0; i<=cellindex;i++)
	{
		String value = sh.getRow(3).getCell(i).getStringCellValue();
		System.out.print(value+" ");
	}
	
	
	
	
	
}
}
