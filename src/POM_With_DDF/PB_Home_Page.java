package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_Home_Page 
{
@FindBy(xpath="//div[text()='My Account']")private WebElement myAcc;
WebDriver driver1;
public PB_Home_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	driver1=driver;
}
public void openDDoptPB_Home_PagemyAcc()
{
Actions act=new Actions(driver1);
act.moveToElement(myAcc).perform();
}









}
