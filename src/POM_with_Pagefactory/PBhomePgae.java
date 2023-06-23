package POM_with_Pagefactory;

import org.apache.xml.security.stax.ext.XMLSecurityConstants.Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBhomePgae 
{
@FindBy(xpath="//div[text()='My Account']")private WebElement myAcc;
WebDriver driver1;

public PBhomePgae(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	driver1=driver;
}
public void openMyAccDropDown()
{
	Actions act=new Actions(driver1);
	act.moveToElement(myAcc).perform();
	
}










}