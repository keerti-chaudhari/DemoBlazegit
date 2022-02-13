package com.demoblaze;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class DemoBlaze {

	WebDriver driver;

	@BeforeSuite
	public void OpenBrowser() {
		System.out.println("This is our BeforSuit Annotaion");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Automation Testing\\chrome98\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterSuite
	public void CloseBrowser() throws InterruptedException {
		System.out.println("This is our AfterSuit Annotaion");
		Thread.sleep(3000);
		driver.close();
	}

	@BeforeMethod
	public void enterUrl() {
		System.out.println("This is our BeforTest Annotaion");
		driver.get("https://www.demoblaze.com/index.html");

	}

	@AfterTest
	public void dbClose() {
		System.out.println("This is our AfterTest Annotaion");

	}

	@BeforeClass
	public void maximizeBrowser() {
		System.out.println("This is our BeforClass Annotaion");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@AfterClass
	public void deleteCookies() {
		System.out.println("This is our AfterClassAnnotaion");
		driver.manage().deleteAllCookies();

	}

	@BeforeMethod
	public void getCookies() {
		System.out.println("This is our BeforMethod Annotaion");

	}

	@AfterMethod
	public void captureScreenshot() throws IOException {
		System.out.println("This is our AfterMethod Annotaion");

	}

	@Test(enabled=false,priority = 1)
	public void Reg() throws InterruptedException

	{

		// Main page URL
		String expectedUrl = "https://www.demoblaze.com/index.html";
		String actulaUrl = driver.getCurrentUrl();
		Assert.assertEquals(actulaUrl, expectedUrl);
		

		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[id=\"signin2\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id=\"sign-username\"]")).sendKeys("Kirtiiii");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id=\"sign-password\"]")).sendKeys("Kirti_2021");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[onclick=\"register()\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

	@Test(priority = 2)
	public void login() throws InterruptedException

	{

		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[id=\"login2\"]")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("input[id=\"loginusername\"]")).sendKeys("Kirtiiii");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id=\"loginpassword\"]")).sendKeys("Kirti_2021");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[onclick=\"logIn()\"]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,250)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[8]/div/div/h4/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[onclick=\"addToCart(8)\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		

		driver.findElement(By.cssSelector("a[href=\"cart.html\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=\"btn btn-success\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"name\"]")).sendKeys("kirti");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"country\"]")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"city\"]")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"card\"]")).sendKeys("123456789123");
		Thread.sleep(2000);
		js.executeScript("scrollBy(0,250)");
		driver.findElement(By.cssSelector("input[id=\"month\"]")).sendKeys("11");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"year\"]")).sendKeys("2025");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		
	}
	
}
