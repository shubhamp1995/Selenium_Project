package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_Mono_Page 
{
@FindBy(xpath="(//input[@type='number'])[2]")private WebElement moNum;
@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signInWithPwd;	
	
	public PB_Mono_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inputPB_Mono_PagemoNum(String MoNum)
	{
		moNum.sendKeys(MoNum);
	}
	public void clickPB_Mono_PagesignInWithPwd()
	{
		signInWithPwd.click();
	}
	
	
	
	
	
}
