package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
	Alert a=driver.switchTo().alert();
	a.dismiss();
	boolean disp = driver.findElement(By.id("demo")).isDisplayed();
	if(disp==true)
		System.out.println("pressed on cancel");
	else
		System.out.println("Not pressed");
	

	}

}
