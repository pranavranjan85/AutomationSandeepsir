package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkOfAmazon {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	List<WebElement> all_link = driver.findElements(By.xpath("//a"));
	int count=all_link.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		String text=all_link.get(i).getText();
		System.out.println(text);
	}
	driver.close();

	}

}
