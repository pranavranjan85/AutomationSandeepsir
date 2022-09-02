package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJob {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("q")).sendKeys("wipro job");
	driver.findElement(By.xpath("(//span[.='wipro jobs'])[1]")).click();
	driver.findElement(By.xpath("//div[@class='EDblX DAVP1']")).click();
List<WebElement> allLink = driver.findElements(By.xpath("//a"));
	for(WebElement link:allLink) {
		System.out.println(link.getText());
	}

	}

}
