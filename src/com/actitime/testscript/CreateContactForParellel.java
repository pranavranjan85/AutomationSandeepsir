package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.BaseForParellel;

public class CreateContactForParellel extends BaseClass{
	@Test
	public void createContact()
	{
		Reporter.log("created Contact");
	}
	/*@Test
	public void modifyContact()
	{
		Reporter.log("modify Contact");
	}
	@Test
	public void deleteContact()
	{
		Reporter.log("Project Contact");
	}*/
}
