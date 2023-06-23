package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBmyAccPage_9 
{
@FindBy(xpath="//span[text()=' My profile ']") private WebElement myProfile;

public PBmyAccPage_9(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickOnMyProf() 
{
	myProfile.click();
}










}
