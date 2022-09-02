package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOnMyntra {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	Actions a=new Actions(driver);
	WebElement menSection = driver.findElement(By.xpath("//a[text()='Men'][1]"));
	a.moveToElement(menSection).perform();
	driver.findElement(By.linkText("T-Shirts")).click();
	String tshirtp = driver.findElement(By.xpath("(//h3[.='HRX by Hrithik Roshan'])[1]/../div/span/span[1]")).getText();
			System.out.println(tshirtp);
	driver.close();


	}

}
