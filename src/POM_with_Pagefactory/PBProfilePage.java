package POM_with_Pagefactory;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zmq.socket.pubsub.Pub;

public class PBProfilePage 
{
@FindBy(xpath="//input[@name='personName']")private WebElement fullName;
	
	WebDriver driver1;
public PBProfilePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	driver1=driver;
}
	public void Switchtochildwindow()
	{
	Set<String> allids = driver1.getWindowHandles();
	ArrayList<String> a1=new ArrayList<String>(allids);
	driver1.switchTo().window(a1.get(1));

	}
	
	public void verifyFullName()
	{
	String ActName=fullName.getAttribute("value");
	String ExpName="shubham";
	if(ActName.equals(ExpName))
	{
		System.out.println("tc pass");
	}
	else
	{
		System.out.println("tc fail");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
