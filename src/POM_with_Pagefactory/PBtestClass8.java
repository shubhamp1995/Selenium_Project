package POM_with_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtestClass8
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

PBLoginPage8 login=new PBLoginPage8(driver);
login.clickOnsingInbtn();
Thread.sleep(2000);

PBmoNoPage8 mono=new PBmoNoPage8(driver);
mono.enterMONO();
mono.clickOnSignWithPwd();
Thread.sleep(2000);

PBpwdPage8 pwd=new PBpwdPage8(driver);
pwd.Enterpwd();
pwd.clickOnSignIn();
Thread.sleep(2000);

PBhomePgae8 home=new PBhomePgae8(driver);
home.openMyAccDropDown();
Thread.sleep(2000);

PBmyAccPage_8 myAcc=new PBmyAccPage_8(driver);
myAcc.clickOnMyProf();
Thread.sleep(2000);

PBProfilePage_8 prof=new PBProfilePage_8(driver);
prof.Switchtochildwindow();
prof.verifyFullName();

Thread.sleep(2000);
driver.quit();


}
}
