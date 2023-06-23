package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getcolsizein_Sheet3 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	short cellsize = WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getLastCellNum();
	
	System.out.println(cellsize);
	
	
	
	
}
}
