package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePageClaim 
{
@FindBy(xpath="//a[text()='Claim ']")private WebElement claim;
WebDriver driver1;
public PBHomePageClaim(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	driver1=driver;
}
public void handleddropdownclaim()
{
Actions act=new Actions(driver1);
act.moveToElement(claim).perform();

}











}
