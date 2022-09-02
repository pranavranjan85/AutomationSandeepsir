package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyAssert {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void verifyTitle()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String expectedTitle="soogle";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			Reporter.log("Title is matching and pass",true);
		}
		else {
			Reporter.log("Title is not matching and fail",true);
		}
		
	}
}
