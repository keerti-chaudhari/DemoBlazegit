package com.demoblaze;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ITestMethodsTestNgListner implements ITestListener
{
 
	
	public void onStart(ITestContext context)
	{
		System.out.println("ITestListener :onStart method----:"+context.getName());
	}
	
	public void onFinish(ITestContext context)
	{
		System.out.println("ITestListener :onFinish method----:"+context.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("ITestListener :onTestFailure method----- :"+result.getName());
	}
	
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(" ITestListener: onTestSkipped method---- :"+result.getName());
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName()+"ITestListener: onTestStart method---");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("ITestListener: onTestSuccess method--- :"+result.getName());
	}
	
	public void onTestFailedButWithSuccessPercentage(ITestResult result)
	{
		System.out.println("ITestListener: onTestFailedButWithSuccessPercentage method--- :"+result.getName());
	}
	
	
}
