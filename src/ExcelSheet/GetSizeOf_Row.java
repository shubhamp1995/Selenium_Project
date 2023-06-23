package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetSizeOf_Row 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	int rowsize = WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum()+1;
	
	System.out.println(rowsize);
	
	
	
	
	
	
}
}
