package com.DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Singleton_Driver_Init {

	private static Singleton_Driver_Init Driver_Instance = null;
	public static WebDriver driver;

	
	private Singleton_Driver_Init() {
		
	}
	
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prakash\\eclipse-workspace\\Types_Of_Java_DesignPattern"
				+ "\\src\\test\\gecko driver exe\\geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
	}
	
	
	public static Singleton_Driver_Init getInstance() {
		if(Driver_Instance == null) {
			Driver_Instance = new Singleton_Driver_Init();
		}
		return Driver_Instance;
		
	}
	
	
	
	
}
