package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CostomerModuleForGroup {
@Test(groups= {"smoke","regression"})
public void createCostomer()
{
	Reporter.log("customer created",true);
}
@Test(groups="regression")
public void modifyCustomer()
{
	Reporter.log("customer modified",true);
}
@Test(groups="smock")
public void deleteCustomer()
{
	Reporter.log("customer deleted");
}
}
