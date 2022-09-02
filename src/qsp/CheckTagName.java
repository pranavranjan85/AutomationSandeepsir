package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTagName {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String t1 = driver.findElement(By.xpath("//a[(.='Forgotten password?')]")).getTagName();
	System.out.println(t1);
	if(t1.equals("a"))
	
		System.out.println("Tag name is matching "+t1);
	else
		System.out.println("Tag name is not matching ");
	
	driver.close();

}
}
