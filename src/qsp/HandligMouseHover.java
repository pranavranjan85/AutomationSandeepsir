package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandligMouseHover {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		driver.manage().window().maximize();
		//following path will help to find element on  mobile version also
		WebElement threedot = driver.findElement(By.id("navbarLandings"));
		Actions a=new Actions(driver);
		a.moveToElement(threedot).perform();
		WebElement resources = driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(resources).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String xpathPhono = "//p[contains(text(),'+91')]";
		String phone = driver.findElement(By.xpath(xpathPhono)).getText();
		System.out.println(phone);
		driver.close();
		

	}

}
