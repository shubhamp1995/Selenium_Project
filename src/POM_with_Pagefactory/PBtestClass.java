package POM_with_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtestClass 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

PBLoginPage login=new PBLoginPage(driver);
login.clickOnsingInbtn();
Thread.sleep(2000);

PBmoNoPage mono=new PBmoNoPage(driver);
mono.enterMONO();
mono.clickOnSignWithPwd();
Thread.sleep(2000);

PBpwdPage pwd=new PBpwdPage(driver);
pwd.Enterpwd();
pwd.clickOnSignIn();
Thread.sleep(2000);

PBhomePgae home=new PBhomePgae(driver);
home.openMyAccDropDown();
Thread.sleep(2000);

PBmyAccPage myAcc=new PBmyAccPage(driver);
myAcc.clickOnMyProf();
Thread.sleep(2000);

PBProfilePage prof=new PBProfilePage(driver);
prof.Switchtochildwindow();
prof.verifyFullName();

Thread.sleep(2000);
driver.quit();


}
}
