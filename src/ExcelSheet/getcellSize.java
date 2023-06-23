package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getcellSize 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet6");
	
//	short cellsize = sh.getRow(0).getLastCellNum();//cellsize
//	System.out.println(cellsize);
	
	int cellindex = sh.getRow(0).getLastCellNum()-1;//cellindex
	System.out.println(cellindex);
	
}
}
