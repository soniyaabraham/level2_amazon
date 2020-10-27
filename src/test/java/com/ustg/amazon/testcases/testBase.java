package com.ustg.amazon.testcases;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import com.ustg.amazon.pages.ResultPage;

public class testBase {
	static WebDriver driver;
	
	
	@BeforeSuite
	 public void init() {
		  System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.Amazon.in");
	  }
	@AfterSuite
	  public void destroy() {
			driver.quit();
			  
	  }

}
