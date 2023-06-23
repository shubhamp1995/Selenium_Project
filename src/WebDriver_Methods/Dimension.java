package WebDriver_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dimension 
{
public Dimension(int i, int j) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
//get default size
 org.openqa.selenium.Dimension get = driver.manage().window().getSize();
int width = get.getWidth();
int height = get.getHeight();
System.out.println(width);
System.out.println(height);

//set new size
org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(800, 600);
driver.manage().window().setSize(d);
System.out.println("============================");
//get a new size
org.openqa.selenium.Dimension g=driver.manage().window().getSize();
int h = g.getHeight();
int wid = g.getWidth();

System.out.println(h);
System.out.println(wid);













}
}
