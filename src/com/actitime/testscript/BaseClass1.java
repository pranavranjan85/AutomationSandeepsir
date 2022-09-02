package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
/**
 * 
 * @author PRANAV
 *
 */
public class BaseClass1 
{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		Reporter.log("browser open",true);
		driver=new ChromeDriver();
		driver.get("");
	}
}
