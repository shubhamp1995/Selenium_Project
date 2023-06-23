package SimplePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demoqaLoginPgae 
{
	WebDriver driver1;
private WebElement UN;
private WebElement pwd;
private WebElement login;

public demoqaLoginPgae(WebDriver driver)
{
	UN=driver.findElement(By.xpath("//input[@placeholder='UserName']"));
	driver.findElement(By.xpath("//input[@type='password']"));
	driver.findElement(By.xpath("//button[text()='Login']"));

}
public void EnterUN()
{
UN.sendKeys("Shubham1");	
}
public void EnterPwd() 
{
	
pwd.sendKeys("Shubh@123");	
}
public void clickOnLogin()
{
login.click();	
}






}
