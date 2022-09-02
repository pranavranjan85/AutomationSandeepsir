package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllConttinsOfStatic {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("file:///C:/Users/PRANAV/Desktop/Static.html");
		List<WebElement> all = d.findElements(By.xpath("//tr"));
		for(WebElement data:all)
	{
		String contains = data.getText();
		System.out.println("all contains of static page are: "+contains);
	}
d.close();
	}

}
