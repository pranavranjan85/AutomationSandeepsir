package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
public class CustomerModule2 extends BaseClass
{
@BeforeMethod
public void login() {
	Reporter.log("Log in",true);
}
@AfterMethod
public void logOut() {
	Reporter.log("LogOut",true);
}
@Test
public void createCustomer() throws InterruptedException {
	Reporter.log("Create customer",true);
}
@Test
public void modifyCustomer() {
	Reporter.log("Modify customer",true);
}

}
