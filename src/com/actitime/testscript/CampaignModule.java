package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CampaignModule {
	@Test(priority=1,invocationCount=0)
	public void createCampaign()
	{
		Reporter.log("Campaign created",true);
	}
	@Test(priority=3)
	public void modifyCampaignr()
	{
		Reporter.log("Campaign modified",true);
	}
	@Test(priority=2)
	public void deleteCampaign()
	{
		Reporter.log("Campaign deleted",true);
    }
}
