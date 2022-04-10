package com.DesignPattern;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SingletonPattern_WebPageTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		Singleton_Driver_Init instanceOfDriver = Singleton_Driver_Init.getInstance();
		driver = instanceOfDriver.openBrowser();
	}

	@Test
	public void testMethod1() {
		driver.get("http://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "Google");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
