package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion2 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[.='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone");
	Thread.sleep(5000);
	List<WebElement> x = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
	int count=x.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String text = x.get(i).getText();
		System.out.println(text);
	}
	x.get(0).click();
	}
}

