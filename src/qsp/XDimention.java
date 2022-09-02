package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XDimention {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	int x1=driver.findElement(By.id("username")).getLocation().getX();
	int y1=driver.findElement(By.id("username")).getLocation().getY();
	System.out.println("x-axis of user name box is "+x1);
	System.out.println("y-axis of user name box is "+y1);
	driver.close();

	}

}
