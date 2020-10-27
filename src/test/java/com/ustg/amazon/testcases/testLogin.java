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

import com.ustg.amazon.pages.LoginPage;
import com.ustg.amazon.pages.ResultPage;
import com.ustg.amazon.pages.HomePage;
public class testLogin extends testBase {
	
	LoginPage loginPage;
	HomePage homePage;
	String parent="";
	

  @Test
  public void login()  throws InterruptedException {
	 
	  loginPage = new LoginPage(driver);
	  loginPage = PageFactory.initElements(driver, LoginPage.class);
	  homePage = new HomePage(driver);
	  homePage = PageFactory.initElements(driver, HomePage.class);
	  //WebDriverWait wait = new WebDriverWait(driver,30);
	  loginPage.clickSignIn();
	  loginPage.enterUserName("sonimol12345@yahoo.com");
	  loginPage.clickContinue();
	  loginPage.enterPassword("pageobject");
	  loginPage.clickLogin();
	  Thread.sleep(5000);
	 String expected = "Hello, soni";
	 String actual = homePage.getHomeTitle();
	  assertEquals(actual, expected);
	  
  }
 
 
	

}
