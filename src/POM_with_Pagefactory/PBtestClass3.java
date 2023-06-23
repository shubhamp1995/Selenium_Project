package POM_with_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtestClass3
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

PBLoginPage3 login=new PBLoginPage3(driver);
login.clickOnsingInbtn();
Thread.sleep(2000);

PBmoNoPage3 mono=new PBmoNoPage3(driver);
mono.enterMONO();
mono.clickOnSignWithPwd();
Thread.sleep(2000);

PBpwdPage3 pwd=new PBpwdPage3(driver);
pwd.Enterpwd();
pwd.clickOnSignIn();
Thread.sleep(2000);

PBhomePgae3 home=new PBhomePgae3(driver);
home.openMyAccDropDown();
Thread.sleep(2000);

PBmyAccPage3 myAcc=new PBmyAccPage3(driver);
myAcc.clickOnMyProf();
Thread.sleep(2000);

PBProfilePage_3 prof=new PBProfilePage_3(driver);
prof.Switchtochildwindow();
prof.verifyFullName();

Thread.sleep(2000);
driver.quit();


}
}
