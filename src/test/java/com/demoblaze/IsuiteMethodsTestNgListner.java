package com.demoblaze;


import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.annotations.Test;

public class IsuiteMethodsTestNgListner implements ISuiteListener
{
	
	public void onStart(ISuite suite)
	{
		System.out.println("ISuiteListener :onStart method");
	}

	public void onFinish(ISuite suite)
	{
		System.out.println("ISuiteListener :onFinish");
	}

}
