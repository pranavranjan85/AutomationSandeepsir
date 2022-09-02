package com.actitime.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
private WebElement untbx;
private WebElement pwtbx;
private WebElement lgbtn;
private WebElement lgout;
public LoginPage(WebDriver driver) {
	untbx=driver.findElement(By.id("username"));
	pwtbx=driver.findElement(By.name("pwd"));
	lgbtn=driver.findElement(By.xpath("//div[.='Login ']"));
	lgout=driver.findElement(By.id("logoutLink"));
}
public void setValue(String un,String pw) throws InterruptedException
{
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgbtn.click();
	Thread.sleep(3000);
	
}
public void setLogout()
{
	lgout.click();
}
}
