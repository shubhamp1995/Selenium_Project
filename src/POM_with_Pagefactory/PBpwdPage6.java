package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBpwdPage6 
{
@FindBy(xpath="//input[@type='password']") private WebElement pwd;
@FindBy(xpath="//span[text()='Sign in']") private WebElement signIN;

public PBpwdPage6(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void Enterpwd()
{
pwd.sendKeys("Sptech95");	
}
public void clickOnSignIn()
{
signIN.click();	
}






}
