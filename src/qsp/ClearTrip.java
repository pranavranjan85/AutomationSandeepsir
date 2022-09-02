package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/flights");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).sendKeys("blr");
	driver.findElement(By.xpath("//p[.='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
	driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).sendKeys("goa");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[.='Goa, IN - Dabolim Airport (GOI)']")).click();
	driver.findElement(By.xpath("(//button[@style='min-width: 250px;'])[1]")).click();
	driver.findElement(By.xpath("//div[.='22']")).click();
	driver.findElement(By.xpath("//button[.='Search flights']")).click();
	driver.findElements(By.xpath("//div[@data-testid='airlineBlock']/div/div/span"));
    List<WebElement> fn = driver.findElements(By.xpath("//img"));
    List<WebElement> dept = driver.findElements(By.xpath("//img/../../../../../div[2]/div[1]/div[1]/p"));
    System.out.println(fn.size());
    for(int i=0;i<fn.size()-1;i++)
    {
    	String name = fn.get(i).getAttribute("alt");
    	String dTime = dept.get(i).getText();
    	System.out.println(name+"-->"+dTime);
    			
    }
//driver.close();
	}

}
