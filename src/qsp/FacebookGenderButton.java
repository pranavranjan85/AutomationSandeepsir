package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookGenderButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int y1 = driver.findElement(By.xpath("//label[.='Female']")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("//label[.='Male']")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("//label[.='Custom']")).getLocation().getY();
		if(y1==y2 && y2==y3)
		{
			System.out.println("Gender buttons are aligned properly,  passed");
		}
		else {
			System.out.println("Gender buttons are not aligned properly,  failed");
		}
		driver.close();

	}

}
