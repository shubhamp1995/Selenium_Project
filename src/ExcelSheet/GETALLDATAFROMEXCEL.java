package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GETALLDATAFROMEXCEL 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
	int rowindex = sh.getLastRowNum();
	int cellindex = sh.getRow(0).getLastCellNum()-1;
	
	for(int i=0; i<=rowindex;i++)
	{
		for(int j=0; j<=cellindex;j++)
		{
			String value = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
		System.out.println(" ");
	}
	
	
	
}
}
