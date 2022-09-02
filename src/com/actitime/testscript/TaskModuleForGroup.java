package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModuleForGroup {
	@Test(groups= {"smoke","regression"})
	public void createTask()
	{
		Reporter.log("Task created",true);
	}
	@Test(groups="regression")
	public void modifyTask()
	{
		Reporter.log("Task modified",true);
	}
	@Test(groups="smock")
	public void deleteTask()
	{
		Reporter.log("Task deleted");
	}
}
