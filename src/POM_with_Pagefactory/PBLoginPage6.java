package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage6
{
 @FindBy(xpath="//a[text()='Sign in']") private WebElement SignIn;
 
 public PBLoginPage6(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void clickOnsingInbtn() 
 {
SignIn.click();	
 }
 
 
 
 
 
 
 
 
 
 
 
}
