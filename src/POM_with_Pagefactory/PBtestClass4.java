package POM_with_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtestClass4
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

PBLoginPage4 login=new PBLoginPage4(driver);
login.clickOnsingInbtn();
Thread.sleep(2000);

PBmoNoPage4 mono=new PBmoNoPage4(driver);
mono.enterMONO();
mono.clickOnSignWithPwd();
Thread.sleep(2000);

PBpwdPage4 pwd=new PBpwdPage4(driver);
pwd.Enterpwd();
pwd.clickOnSignIn();
Thread.sleep(2000);

PBhomePgae4 home=new PBhomePgae4(driver);
home.openMyAccDropDown();
Thread.sleep(2000);

PBmyAccPage4 myAcc=new PBmyAccPage4(driver);
myAcc.clickOnMyProf();
Thread.sleep(2000);

PBProfilePage_4 prof=new PBProfilePage_4(driver);
prof.Switchtochildwindow();
prof.verifyFullName();

Thread.sleep(2000);
driver.quit();


}
}
