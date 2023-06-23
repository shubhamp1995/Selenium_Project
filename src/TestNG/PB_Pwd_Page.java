package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_Pwd_Page 
{
	@FindBy(xpath="//input[@type='password']") private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement signIN;
	
	public PB_Pwd_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputPB_Pwd_PagePwd(String Pwd)
	{
	pwd.sendKeys(Pwd);	
	}
	public void clickPB_Pwd_PagesignIn()
	{
	signIN.click();	
	}
	
	
	
	
	
}
