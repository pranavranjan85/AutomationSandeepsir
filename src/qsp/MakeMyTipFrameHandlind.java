package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTipFrameHandlind {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	 List<WebElement> allFrame = driver.findElements(By.xpath("//iframe"));
	int count = allFrame.size();
	System.out.println(count);
	for(WebElement f:allFrame) {
		System.out.println(f.getText());
	}

	}

}
