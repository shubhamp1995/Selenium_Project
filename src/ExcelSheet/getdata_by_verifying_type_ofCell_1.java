package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getdata_by_verifying_type_ofCell_1 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file =new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
	
	Cell cinfo = sh.getRow(0).getCell(1);
	CellType s2 = cinfo.getCellType();
	
	if(s2==CellType.STRING)
	{
		String value = cinfo.getStringCellValue();
		System.out.println(value);
	}
	else if(s2==CellType.NUMERIC)
	{
		double value = cinfo.getNumericCellValue();
		System.out.println(value);
	}
	else if(s2==CellType.BOOLEAN)
	{
		boolean value = cinfo.getBooleanCellValue();
		System.out.println(value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
