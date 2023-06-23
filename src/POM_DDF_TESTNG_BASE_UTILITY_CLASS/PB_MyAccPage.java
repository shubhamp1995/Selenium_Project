package POM_DDF_TESTNG_BASE_UTILITY_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_MyAccPage 
{
@FindBy(xpath="//span[text()=' My profile ']")private WebElement myProfile;

public PB_MyAccPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickOnPbMyAccPageMyProfile() 
{
	myProfile.click();
	
}






}
