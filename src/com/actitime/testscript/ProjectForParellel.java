package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.BaseForParellel;

public class ProjectForParellel extends BaseClass{
	@Test
	public  void createProject()
	{
		Reporter.log("created Project");
	}
	/*@Test
	public void modifyProject()
	{
		Reporter.log("modify Project");
	}
	@Test
	public void deleteProject()
	{
		Reporter.log("Project deleted");
	}*/
}
