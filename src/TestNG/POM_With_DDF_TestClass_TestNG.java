package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class POM_With_DDF_TestClass_TestNG
{
@Test
public void first_tc()throws EncryptedDocumentException, IOException, InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet7");

PB_login_Page login=new PB_login_Page(driver);
login.clickPB_login_PageSignIn();
Thread.sleep(2000);

PB_Mono_Page mono=new PB_Mono_Page(driver);
String MoNum = Sh.getRow(0).getCell(0).getStringCellValue();
mono.inputPB_Mono_PagemoNum(MoNum);
mono.clickPB_Mono_PagesignInWithPwd();
Thread.sleep(2000);

PB_Pwd_Page pwd=new PB_Pwd_Page(driver);
String Pwd = Sh.getRow(0).getCell(1).getStringCellValue();
pwd.inputPB_Pwd_PagePwd(Pwd);
pwd.clickPB_Pwd_PagesignIn();
Thread.sleep(2000);

PB_Home_Page home=new PB_Home_Page(driver);
home.openDDoptPB_Home_PagemyAcc();
Thread.sleep(2000);

PB_myAcc_Page myAcc=new PB_myAcc_Page(driver);
myAcc.clickPB_myAcc_PagemyProfile();
Thread.sleep(2000);

PB_myProfile_Page myProfile =new PB_myProfile_Page(driver);
myProfile.HandledChildWindow();
String ExpText = Sh.getRow(0).getCell(2).getStringCellValue();
myProfile.VerifyPB_myProfile_PagefullName(ExpText);
Thread.sleep(2000);

Reporter.log("First TC pass",true);
driver.quit();

}
}
