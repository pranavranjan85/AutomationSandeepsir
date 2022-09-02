package com.actitime.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestForActitime {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testActitime() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginForActitime la=new LoginForActitime();
		PageFactory.initElements(driver, la);
		la.setLogin("admin", "manager");
		HomeForActitime ha=new HomeForActitime(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ha.setTask();
		TaskForActitime ta=new TaskForActitime(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ta.setAdd();
	}
}
