package POM_with_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtestClass1
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

PBLoginPage1 login=new PBLoginPage1(driver);
login.clickOnsingInbtn();
Thread.sleep(2000);

PBmoNoPage1 mono=new PBmoNoPage1(driver);
mono.enterMONO();
mono.clickOnSignWithPwd();
Thread.sleep(2000);

PBpwdPage1 pwd=new PBpwdPage1(driver);
pwd.Enterpwd();
pwd.clickOnSignIn();
Thread.sleep(2000);

PBhomePgae1 home=new PBhomePgae1(driver);
home.openMyAccDropDown();
Thread.sleep(2000);

PBmyAccPage1 myAcc=new PBmyAccPage1(driver);
myAcc.clickOnMyProf();
Thread.sleep(2000);

PBProfilePage_1 prof=new PBProfilePage_1(driver);
prof.Switchtochildwindow();
prof.verifyFullName();

Thread.sleep(2000);
driver.quit();


}
}
