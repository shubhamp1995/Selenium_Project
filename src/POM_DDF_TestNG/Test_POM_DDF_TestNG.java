package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_POM_DDF_TestNG 
{
	PB_LoginPage login;
	PB_MoNum_Page monum;
	PB_PwdPage pwd;
	PB_HomePage home;
	PB_MyAccPage myAcc;
	PB_ProfilePage myprofile;
	WebDriver driver;
	org.apache.poi.ss.usermodel.Sheet Sh;
	
	@BeforeClass
	public void OpenBrwoser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\shubham\\Music\\book2.xls");
		 Sh = WorkbookFactory.create(file).getSheet("Sheet7");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		login=new PB_LoginPage(driver);
		monum=new PB_MoNum_Page(driver);
		pwd=new PB_PwdPage(driver);
		home= new PB_HomePage(driver);
		myAcc=new PB_MyAccPage(driver);
		myprofile=new PB_ProfilePage(driver);

	}
	
	@BeforeMethod
	public void LoginToApp() throws InterruptedException
	{
		login.clickOnPbLoginPagesignIn();
		monum.inpPbMoNumPageMoNUm(Sh.getRow(0).getCell(0).getStringCellValue());
		monum.clickOnPbMoNumPageSignInWithPwd();
		pwd.InpPbPwdPagePWd(Sh.getRow(0).getCell(1).getStringCellValue());
		pwd.clickOnPWdPageSignIn();
		Thread.sleep(3000);
	}
	@Test
	public void VerifyFullName() throws InterruptedException
	{
		home.OpenDDOptFrmPBHomePageMyAcc();
		Thread.sleep(2000);
		myAcc.clickOnPbMyAccPageMyProfile();
		myprofile.switchToSwitchChildWindow();
		String actResult=myprofile.getPBProfilePageFullName();
		String expResult=Sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(actResult, expResult,"Failed: both results are diff-: ");
	}
	@AfterMethod	
	public void LogOutFromApp()
	{
		
	}
	
	@AfterClass	
	public void ClosedBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
