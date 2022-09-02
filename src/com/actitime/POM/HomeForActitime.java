package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeForActitime {
@FindBy(id="container_tasks")
private WebElement taskbtn;

public HomeForActitime(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setTask() {
	taskbtn.click();
}
}
