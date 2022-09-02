package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskForActitime {
@FindBy(xpath="//div[.='Add New']")
private WebElement addbtn;

public TaskForActitime(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void setAdd()
{
	addbtn.click();
}
}

