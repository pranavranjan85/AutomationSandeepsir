package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggLearn {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.learnvern.com/");
	driver.findElement(By.id("search-megamenu-input")).sendKeys("testing");
	List<WebElement> autosugg = driver.findElements(By.xpath("//a"));
	Thread.sleep(8000);
	int count = autosugg.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		String text = autosugg.get(i).getText();
		System.out.println(text);
	}
	autosugg.get(0).click();
	}
}
