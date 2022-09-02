package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.BaseForParellel;

public class TaskForParellel extends BaseClass {
	@Test
	public void createTask()
	{
		Reporter.log("created Task");
	}
	/*@Test
	public void modifyTask()
	{
		Reporter.log("modify Task");
	}
	@Test
	public void deleteTask()
	{
		Reporter.log("Task deleted");
	}*/
}
