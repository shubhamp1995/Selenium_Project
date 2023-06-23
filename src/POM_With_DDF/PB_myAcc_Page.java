package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_myAcc_Page 
{
@FindBy(xpath="//span[text()=' My profile ']") private WebElement myProfile;
	
	public PB_myAcc_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickPB_myAcc_PagemyProfile()
	{
		myProfile.click();
	}
	
	
	
}
