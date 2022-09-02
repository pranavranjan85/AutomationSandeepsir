package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModuleForGroup {
	@Test(groups= {"smoke","regression"})
	public void createProject()
	{
		Reporter.log("Project created",true);
	}
	@Test(groups="regression")
	public void modifyProject()
	{
		Reporter.log("Project modified",true);
	}
	@Test(groups="smock")
	public void deleteProject()
	{
		Reporter.log("Project deleted");
	}
}
