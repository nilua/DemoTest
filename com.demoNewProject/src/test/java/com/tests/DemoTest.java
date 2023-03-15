package com.tests;

import org.testng.annotations.Test;

public class DemoTest 

{
	
	@Test	
	public void test01()
	{
		//here e cant use workbook because we have not used dependancy of workbook in pom.xml
		
		System.out.println("hii");
		System.out.println("bye");
	}

}
