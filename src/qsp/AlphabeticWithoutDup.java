package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticWithoutDup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		TreeSet<String>	ts=new TreeSet<String>();
		WebDriver driver =new ChromeDriver();
		driver.get("C:\\Users\\PRANAV\\Desktop\\multiList.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		int count=allOptions.size();
		for(WebElement option:allOptions)
		{
			String text = option.getText();
			ts.add(text);
		}
		for(String print:ts)
		{
			System.out.println(print);
		}
		driver.close();


	}

}
