package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoOfPOM {
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwtbx;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	@FindBy(id="logoutLink")
	private WebElement lgout;
public DemoOfPOM(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setValue(String un,String pw) 
{
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgbtn.click();
	
}
public void setLogout()
{
	lgout.click();
}
}
