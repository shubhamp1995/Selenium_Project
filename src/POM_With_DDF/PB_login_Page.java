package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_login_Page 
{

	@FindBy(xpath="//a[text()='Sign in']") private WebElement signIn;
	
	
	public PB_login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPB_login_PageSignIn()
	{
	signIn.click();	
	}
	
	
	
	
}
