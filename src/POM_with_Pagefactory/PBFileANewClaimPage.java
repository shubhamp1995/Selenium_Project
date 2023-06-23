package POM_with_Pagefactory;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBFileANewClaimPage
{
@FindBy(xpath="//a[text()='Go to your policies']")private WebElement  goToyourPolicies;
WebDriver driver1;
public PBFileANewClaimPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	driver1=driver;
}
public void swtichToChildWindow() 
{
Set<String> id = driver1.getWindowHandles();
ArrayList<String> a1=new ArrayList<String>(id);
driver1.switchTo().window(a1.get(1));

}
public void getText() 
{
	String text = goToyourPolicies.getText();
	System.out.println(text);
	String ExpText="Go to your policies";
	if(text.equals(ExpText))
	{
		System.out.println("tc pass");
	}
	else
	{
		System.out.println("tc fail");
	}
	
}











}
