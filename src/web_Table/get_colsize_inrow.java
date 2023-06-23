package web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_colsize_inrow 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	//get col size
	int colsize = driver.findElements(By.xpath("//table[@id='countries']//tr[3]/td")).size();
	System.out.println(colsize);
	
	//for header
//	int colsize1 = driver.findElements(By.xpath("//table[@id='countries']//tr[3]/th")).size();
//	System.out.println(colsize1);
	
}
}
