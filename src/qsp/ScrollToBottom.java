package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToBottom {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	 JavascriptExecutor j=(JavascriptExecutor)driver;
	 j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 Thread.sleep(5000);
		j.executeScript("window.scrollTo(0,0)");

	}

}
