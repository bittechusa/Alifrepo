package com.bit.test;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest 
{
	ChromeDriver driver;
	
	@Before
	public void add()
	{
		System.setProperty("webdriver.chrome.driver", "C:/chromeDriver.exe");
		driver=new ChromeDriver();
		driver.get("http://bluefly.com");
		
	}
}
