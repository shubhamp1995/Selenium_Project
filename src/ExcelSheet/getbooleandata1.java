package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getbooleandata1 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
boolean value = WorkbookFactory.create(file).getSheet("Sheet6").getRow(0).getCell(6).getBooleanCellValue();
System.out.println(value);



}
}
