package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GETALL_DIFF_DATA_FROMEXCEL 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet6");
	int rowindex = sh.getLastRowNum();
	int cellindex = sh.getRow(0).getLastCellNum()-1;
	for(int i=0;i<=rowindex;i++)
	{
		for(int j=0;j<=cellindex;j++)
		{
			Cell info = sh.getRow(i).getCell(j);
			CellType s1 = info.getCellType();
			if(s1==CellType.STRING)
			{
				String value = info.getStringCellValue();
				System.out.print(value+" ");
			}
			else if(s1==CellType.NUMERIC)
			{
				double value = info.getNumericCellValue();
				System.out.print(value+" ");
			}
			else if(s1==CellType.BOOLEAN)
			{
				boolean value = info.getBooleanCellValue();
				System.out.print(value+" ");
			}
		}
		System.out.println(" ");
	}
	
	
	
}
}
