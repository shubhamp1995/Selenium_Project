package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getcolsizeinrow 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	//short cellsize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	//System.out.println("total size"+" "+cellsize);
	
	short colsize = (short) (WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum()-1);
	System.out.println("index size"+" "+colsize);
	
	
	
}
}
