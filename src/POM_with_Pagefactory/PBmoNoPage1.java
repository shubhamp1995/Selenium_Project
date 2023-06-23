package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBmoNoPage1
{
@FindBy(xpath=("(//input[@id='central-login-module-sign-mobile'])[2]")) private WebElement moNO;
@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPwd;

public PBmoNoPage1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void enterMONO() 
{
moNO.sendKeys("7020694060");	
}

public void clickOnSignWithPwd() 
{
signInWithPwd.click();	
}




}
