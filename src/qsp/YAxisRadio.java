package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YAxisRadio {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//a[@rel='async']")).click();
			Thread.sleep(6000);
			int f=driver.findElement(By.xpath("//input[@type='radio']")).getLocation().getY();
			int m=driver.findElement(By.xpath("//input[@type='radio']")).getLocation().getY();
			int c=driver.findElement(By.xpath("//input[@type='radio']")).getLocation().getY();
			if(f==m && m==c)
				System.out.println("Gender exists in proper alignment, pass");
			else
				System.out.println("Gender does not exists in proper alignment, fail");
			System.out.println(f);
			System.out.println(m);
			System.out.println(c);
			driver.close();
	}

}
