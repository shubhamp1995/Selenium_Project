package POM_with_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtestClass7
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

PBLoginPage7 login=new PBLoginPage7(driver);
login.clickOnsingInbtn();
Thread.sleep(2000);

PBmoNoPage7 mono=new PBmoNoPage7(driver);
mono.enterMONO();
mono.clickOnSignWithPwd();
Thread.sleep(2000);

PBpwdPage7 pwd=new PBpwdPage7(driver);
pwd.Enterpwd();
pwd.clickOnSignIn();
Thread.sleep(2000);

PBhomePgae7 home=new PBhomePgae7(driver);
home.openMyAccDropDown();
Thread.sleep(2000);

PBmyAccPage7 myAcc=new PBmyAccPage7(driver);
myAcc.clickOnMyProf();
Thread.sleep(2000);

PBProfilePage_7 prof=new PBProfilePage_7(driver);
prof.Switchtochildwindow();
prof.verifyFullName();

Thread.sleep(2000);
driver.quit();


}
}
