package POM_with_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtestClass5
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

PBLoginPage5 login=new PBLoginPage5(driver);
login.clickOnsingInbtn();
Thread.sleep(2000);

PBmoNoPage5 mono=new PBmoNoPage5(driver);
mono.enterMONO();
mono.clickOnSignWithPwd();
Thread.sleep(2000);

PBpwdPage5 pwd=new PBpwdPage5(driver);
pwd.Enterpwd();
pwd.clickOnSignIn();
Thread.sleep(2000);

PBhomePgae5 home=new PBhomePgae5(driver);
home.openMyAccDropDown();
Thread.sleep(2000);

PBmyAccPage5 myAcc=new PBmyAccPage5(driver);
myAcc.clickOnMyProf();
Thread.sleep(2000);

PBProfilePage_5 prof=new PBProfilePage_5(driver);
prof.Switchtochildwindow();
prof.verifyFullName();

Thread.sleep(2000);
driver.quit();


}
}
