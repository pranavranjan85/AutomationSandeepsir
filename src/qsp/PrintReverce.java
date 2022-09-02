package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintReverce {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/PRANAV%20RANJAN/Desktop/multiList.html");
		WebElement cpListBox = driver.findElement(By.id("cp"));
		Select s=new Select(cpListBox);
		List<WebElement> allOptions = s.getOptions();
		int count=allOptions.size();
		for(int i=count-1;i>0;i--)
		{
			String text = allOptions.get(i).getText();
			System.out.println(text);
		}
		driver.close();

	}

}
