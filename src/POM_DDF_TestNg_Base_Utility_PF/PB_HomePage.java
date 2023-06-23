package POM_DDF_TestNg_Base_Utility_PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_HomePage 
{
@FindBy(xpath="//div[text()='My Account']")private WebElement myAcc;
WebDriver	driver1;

public PB_HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	driver1=driver;
}
public void OpenDDOptFrmPBHomePageMyAcc()
{
Actions act=new Actions(driver1);
act.moveToElement(myAcc).perform();

}








}
