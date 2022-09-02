package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.BaseForParellel;

public class CostomerModuleForParellel extends BaseClass {
@Test
public void createCostomer()
{
	Reporter.log("created costomer");
}
/*@Test
public void modifyCustomer()
{
	Reporter.log("modify customer");
}
@Test
public void deleteCustomer()
{
	Reporter.log("customer deleted");
}*/
}
