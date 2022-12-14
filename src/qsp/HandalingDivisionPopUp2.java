package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandalingDivisionPopUp2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.findElement(By.id("dob")).click();
	WebElement yearListBox = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select s=new Select(yearListBox);
	s.selectByValue("1995");
	WebElement monthListBox = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select s1=new Select(monthListBox);
	s1.selectByValue("0");
	driver.findElement(By.xpath("//a[text()='2']")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("7667980802");
	driver.findElement(By.id("renew_policy_submit")).click();
	boolean display = driver.findElement(By.id("policynumberError")).isDisplayed();
	if(display==true)
		System.out.println("'please enter valid policy number' is displayed");
	else
		System.out.println("'please enter valid policy number' is not displayed");
	driver.close();

	}

}
