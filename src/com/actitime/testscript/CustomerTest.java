package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CustomerTest extends BaseClass {
@Test
public void createcustomer() throws InterruptedException {
	Reporter.log("customer created");
	Thread.sleep(5000);
	Assert.fail();
}
}
