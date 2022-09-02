package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage l=new LoginPage(driver);
		l.setValue("admin", "manager");
		//driver.close();
		l.setLogout();

	}

}
