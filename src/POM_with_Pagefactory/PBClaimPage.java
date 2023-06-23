package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBClaimPage 
{
@FindBy(xpath="//span[text()='File a new claim']")private WebElement FileANewClaim;

public PBClaimPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickonFileANewClaim() 
{
	FileANewClaim.click();
}





}

