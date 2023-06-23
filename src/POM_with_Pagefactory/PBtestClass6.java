package POM_with_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtestClass6
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

PBLoginPage6 login=new PBLoginPage6(driver);
login.clickOnsingInbtn();
Thread.sleep(2000);

PBmoNoPage6 mono=new PBmoNoPage6(driver);
mono.enterMONO();
mono.clickOnSignWithPwd();
Thread.sleep(2000);

PBpwdPage6 pwd=new PBpwdPage6(driver);
pwd.Enterpwd();
pwd.clickOnSignIn();
Thread.sleep(2000);

PBhomePgae6 home=new PBhomePgae6(driver);
home.openMyAccDropDown();
Thread.sleep(2000);

PBmyAccPage6 myAcc=new PBmyAccPage6(driver);
myAcc.clickOnMyProf();
Thread.sleep(2000);

PBProfilePage_6 prof=new PBProfilePage_6(driver);
prof.Switchtochildwindow();
prof.verifyFullName();

Thread.sleep(2000);
driver.quit();


}
}
