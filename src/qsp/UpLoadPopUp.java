package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpLoadPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/");
	driver.findElement(By.xpath("//div[text()='Login']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("pover89026@abncol.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("demo123");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	//driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
	WebElement myProfile = driver.findElement(By.xpath("//div[text()='My Naukri']"));
	Actions a=new Actions(driver);
	a.moveToElement(myProfile).perform();
	driver.findElement(By.linkText("Edit Profile")).click();
	File f=new File("./data/pranav resume.docx");
	String abspath = f.getAbsolutePath();
	driver.findElement(By.id("attachCV")).sendKeys(abspath);
	

	}

}
