package POM_with_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtestClass2
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

PBLoginPage2 login=new PBLoginPage2(driver);
login.clickOnsingInbtn();
Thread.sleep(2000);

PBmoNoPage2 mono=new PBmoNoPage2(driver);
mono.enterMONO();
mono.clickOnSignWithPwd();
Thread.sleep(2000);

PBpwdPage2 pwd=new PBpwdPage2(driver);
pwd.Enterpwd();
pwd.clickOnSignIn();
Thread.sleep(2000);

PBhomePgae2 home=new PBhomePgae2(driver);
home.openMyAccDropDown();
Thread.sleep(2000);

PBmyAccPage2 myAcc=new PBmyAccPage2(driver);
myAcc.clickOnMyProf();
Thread.sleep(2000);

PBProfilePage_2 prof=new PBProfilePage_2(driver);
prof.Switchtochildwindow();
prof.verifyFullName();

Thread.sleep(2000);
driver.quit();


}
}
