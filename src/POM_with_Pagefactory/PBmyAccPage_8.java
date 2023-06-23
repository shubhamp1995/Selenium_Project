package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBmyAccPage_8 
{
@FindBy(xpath="//span[text()=' My profile ']") private WebElement myProfile;

public PBmyAccPage_8(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickOnMyProf() 
{
	myProfile.click();
}










}
