package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {
	@Test(priority=1,invocationCount=2)
	public void createTask()
	{
		Reporter.log("Task created",true);
	}
	@Test(priority=3)
	public void modifyTask()
	{
		Reporter.log("Task modified",true);
	}
	@Test(priority=2,dependsOnMethods="createTask")
public void deleteTask()
	{
		Reporter.log("Task deleted",true);
    }
}
