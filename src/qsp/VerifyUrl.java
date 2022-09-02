package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args){
	WebDriver driver=new ChromeDriver();
driver.get("https://www.seleniumhq.org/");
String eUrl=("https://www.selenium.dev/");
String cUrl=driver.getCurrentUrl();
if(cUrl.equals(eUrl))
	System.out.println("Pass");
else
	System.out.println("Fail");
driver.close();
	}

}
