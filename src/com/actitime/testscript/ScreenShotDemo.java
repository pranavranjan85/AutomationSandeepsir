package com.actitime.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testScreenShot() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		TakesScreenshot t=(TakesScreenshot) driver;
		File scr = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/ss.png");
		FileUtils.copyFile(scr, dest);
		driver.close();
	}
}
