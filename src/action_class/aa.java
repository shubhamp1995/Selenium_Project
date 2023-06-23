package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aa 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/feed/trending?bp=6gQJRkVleHBsb3Jl");
	String text = driver.findElement(By.xpath("((//div[@id='dismissible'])[1]//yt-formatted-string)[1]")).getText();
	System.out.println(text);
}
}
