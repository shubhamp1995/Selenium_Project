package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAlldataInRow2 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
	int data = sh.getRow(0).getLastCellNum()-1;
	
	for(int i=0;i<=data;i++)
	{
		String value = sh.getRow(0).getCell(i).getStringCellValue();
		System.out.print(value+" ");
	}
	
	
	
}
}
