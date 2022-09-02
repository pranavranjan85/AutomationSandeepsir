package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintIphonePrice {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.name("q")).sendKeys("i phone 13 max pro");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	List<WebElement> indEle = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]"));
List<WebElement> phonePrice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]/../../div[2]/div[1]/div[1]/div"));
	
for(int i=0;i<indEle.size()-1;i++){
	String phName = indEle.get(i).getText();
	String phPrice = phonePrice.get(i).getText();
	System.out.println(phName+"---->"+phPrice);
	

}

	}

}
