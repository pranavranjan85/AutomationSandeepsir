package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcNews {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com/");
	List<WebElement> newsNo = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']"));
	List<WebElement> link = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
	System.out.println("All BBC business news are:");	
	for(int i = 0;i<newsNo.size();i++) {
		String b = newsNo.get(i).getText();
		//System.out.print(b);
//	for(int j = i;j<=i;j++) {
	String n = link.get(i).getText();
	System.out.println(b+"-->"+n);
		}
	
	
	/*for(WebElement headLines:news)
	{
		String news = newsNo.getText();
		for(WebElement no:newsNo) {
			String n = no.getText();
			System.out.println(n+"-->"+news);
		}
	}*/
	driver.close();

	}

}
