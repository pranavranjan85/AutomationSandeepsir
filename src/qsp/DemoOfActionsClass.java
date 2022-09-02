package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoOfActionsClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Actions a=new Actions(driver);
		WebElement menSection = driver.findElement(By.xpath("//a[text()='Men'][1]"));
		a.moveToElement(menSection).perform();
		driver.findElement(By.linkText("T-Shirts")).click();
		WebElement target1 = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[2]"));
		Thread.sleep(2000);
		a.doubleClick(target1).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
