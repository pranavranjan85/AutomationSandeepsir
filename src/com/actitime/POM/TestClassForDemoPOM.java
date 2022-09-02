package com.actitime.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestClassForDemoPOM {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testLogin() throws InterruptedException  {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/");
DemoOfPOM d=new DemoOfPOM(driver);
d.setValue("admin1", "manager1");
WebDriverWait w=new WebDriverWait(driver, 10);
w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='errormsg'])[1]")));
d.setValue("admin", "manager");
d.setLogout();
	}

}
