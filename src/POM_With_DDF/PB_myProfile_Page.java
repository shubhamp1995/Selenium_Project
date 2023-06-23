package POM_With_DDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_myProfile_Page 
{
@FindBy(xpath="//input[@name='personName']")private WebElement fullName;
WebDriver driver1;
public PB_myProfile_Page(WebDriver driver)
{
PageFactory.initElements(driver, this);
	driver1=driver;
	
}
public void HandledChildWindow()
{
	Set<String> id = driver1.getWindowHandles();
	ArrayList<String> a1=new ArrayList<String>(id);
	driver1.switchTo().window(a1.get(1));
}
public void VerifyPB_myProfile_PagefullName(String ExpText) 
{
	String ActText = fullName.getAttribute("value");
	if(ActText.equals(ExpText))
	{
		System.out.println("tc pass");
	}
	else
	{
		System.out.println("tc fail");
	}
	
}



}
