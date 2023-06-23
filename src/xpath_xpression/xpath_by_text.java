package xpath_xpression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://paytm.com/recharge");
	driver.findElement(By.xpath("//button[text()='Proceed to Recharge']")).click();
}
}
