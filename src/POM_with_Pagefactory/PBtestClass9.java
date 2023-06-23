package POM_with_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtestClass9
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

PBLoginPage9 login=new PBLoginPage9(driver);
login.clickOnsingInbtn();
Thread.sleep(2000);

PBmoNoPage9 mono=new PBmoNoPage9(driver);
mono.enterMONO();
mono.clickOnSignWithPwd();
Thread.sleep(2000);

PBpwdPage9 pwd=new PBpwdPage9(driver);
pwd.Enterpwd();
pwd.clickOnSignIn();
Thread.sleep(2000);

PBhomePgae9 home=new PBhomePgae9(driver);
home.openMyAccDropDown();
Thread.sleep(2000);

PBmyAccPage_9 myAcc=new PBmyAccPage_9(driver);
myAcc.clickOnMyProf();
Thread.sleep(2000);

PBProfilePage_9 prof=new PBProfilePage_9(driver);
prof.Switchtochildwindow();
prof.verifyFullName();

Thread.sleep(2000);
driver.quit();


}
}
