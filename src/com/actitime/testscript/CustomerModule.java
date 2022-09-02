package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
@Test(priority=1,invocationCount=5)
public void createCustomer()
{
	Reporter.log("Customer created",true);
}
@Test(priority=3)
public void modifyCustomer()
{
	Reporter.log("Customer modified",true);
}
@Test(priority=2)
public void deleteCustomer()
{
	Reporter.log("Customer deleted",true);
}
}
