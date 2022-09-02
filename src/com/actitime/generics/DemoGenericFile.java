package com.actitime.generics;

import java.io.IOException;

public class DemoGenericFile {

	public static void main(String[] args) throws IOException {
		FileLibrary f=new FileLibrary();
		System.out.println(f.getPropertyData("url"));
		System.out.println(f.getPropertyData("username"));
		System.out.println(f.getPropertyData("password"));
		System.out.println(f.getExcelData("login",2, 1));
	}

}
