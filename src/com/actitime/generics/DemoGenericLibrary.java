package com.actitime.generics;

import java.io.IOException;

import qsp.FileLib;

public class DemoGenericLibrary {

	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
	    f.setExcelData("Create Customer",1, 2,"ICICI_007");
	    String custName = f.getExcelData("Create Customer", 1, 2);
	    System.out.println(custName);

	}

}
