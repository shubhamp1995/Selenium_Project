package POM_DDF_TESTNG_BASE_UTILITY_CLASS;

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

public class Test_POM_DDF_TestNG extends Base_Class
{
	PB_LoginPage login;
	PB_MoNum_Page monum;
	PB_PwdPage pwd;
	PB_HomePage home;
	PB_MyAccPage myAcc;
	PB_ProfilePage myprofile;
	
	
	@BeforeClass
	public void OpenBrwoser() throws EncryptedDocumentException, IOException
	{
		InitializedBrowser();
		login=new PB_LoginPage(driver);
		monum=new PB_MoNum_Page(driver);
		pwd=new PB_PwdPage(driver);
		home= new PB_HomePage(driver);
		myAcc=new PB_MyAccPage(driver);
		myprofile=new PB_ProfilePage(driver);

	}
	
	@BeforeMethod
	public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.clickOnPbLoginPagesignIn();
		monum.inpPbMoNumPageMoNUm(Utility_Class.getTestData(0, 0));
		monum.clickOnPbMoNumPageSignInWithPwd();
		pwd.InpPbPwdPagePWd(Utility_Class.getTestData(0, 1));
		pwd.clickOnPWdPageSignIn();
		Thread.sleep(3000);
	}
	@Test
	public void VerifyFullName() throws InterruptedException, EncryptedDocumentException, IOException
	{
		home.OpenDDOptFrmPBHomePageMyAcc();
		Thread.sleep(2000);
		myAcc.clickOnPbMyAccPageMyProfile();
		myprofile.switchToSwitchChildWindow();
		String actResult=myprofile.getPBProfilePageFullName();
		String expResult=Utility_Class.getTestData(0, 2);
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
