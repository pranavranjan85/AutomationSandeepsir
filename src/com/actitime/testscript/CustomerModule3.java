package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class CustomerModule3 extends BaseClass
{
@Test
public void createCostomer()
{
	Reporter.log("create costomer",true);
}
@Test
public void deleteCostomer()
{
	Reporter.log("delete costomer",true);
}

}
