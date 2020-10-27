package com.ustg.amazon.testcases;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import com.ustg.amazon.pages.Category2ResultPage;
import com.ustg.amazon.pages.HomePage;
import com.ustg.amazon.pages.LoginPage;
import com.ustg.amazon.pages.ProductPage;
import com.ustg.amazon.pages.ResultPage;

public class testResult extends testBase{
	
	//WebDriver driver;
	ResultPage resultPage;
	ProductPage productPage;
	Category2ResultPage category2ResultPage;
	LoginPage loginPage;
	HomePage homePage;
	String parent="";
	
	
	
	 @Test
	  public void addToCart()  throws InterruptedException {
		  resultPage = new ResultPage(driver);
		 resultPage = PageFactory.initElements(driver, ResultPage.class);
		 productPage = new ProductPage(driver);
		 productPage = PageFactory.initElements(driver, ProductPage.class);
		 category2ResultPage = new Category2ResultPage(driver);
		 category2ResultPage = PageFactory.initElements(driver, Category2ResultPage.class);
		 homePage = new HomePage(driver);
		  homePage = PageFactory.initElements(driver, HomePage.class);
		 homePage.clickMenu();
		  homePage.clickItemMenu();
		  homePage.clickItem();
		  Thread.sleep(5000);
		  resultPage.clickPrice();
		  Thread.sleep(5000);
		  resultPage.clickBrand();
		  Thread.sleep(5000);
		  resultPage.clickDisplay();
		  Thread.sleep(5000);
		  resultPage.clickRating();
		  Thread.sleep(5000);
		  resultPage.clickItem();
		  parent = driver.getWindowHandle();
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			while (it.hasNext()){
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			 Thread.sleep(5000);
			 productPage.clickAddToCart();
			  productPage.clickCart();
			  productPage.clickQty("2");
			  homePage.clickMenu();
			  category2ResultPage.clickCategory();
			  Thread.sleep(5000);
			  category2ResultPage.clickMenu();
			  category2ResultPage.clickItem();
			  Thread.sleep(5000);
			  category2ResultPage.clickPrice();
			  Thread.sleep(5000);
			  category2ResultPage.clickFeature1();
			  Thread.sleep(5000);
			  category2ResultPage.clickFeature2();
			  Thread.sleep(5000);
			  category2ResultPage.selectItem();
			  parent = driver.getWindowHandle();
				Set<String> ids1 = driver.getWindowHandles();
				Iterator<String> it1 = ids1.iterator();
				while (it1.hasNext()){
					driver.switchTo().window(it1.next());
					System.out.println(driver.getTitle());
				}
				 Thread.sleep(5000);
				productPage.clickAddToCart();
				 productPage.clickCart();
				 String expected = "Amazon.in Shopping Cart";
				  String actual = driver.getTitle();
				  assertEquals(actual, expected);
				  
		  
	  }
	 @Test
	  public void logout()  throws InterruptedException {
		loginPage = new LoginPage(driver);
		  loginPage = PageFactory.initElements(driver, LoginPage.class);
		 Actions action =new Actions(driver);
		action.moveToElement(loginPage.loginlink).build().perform();
		  Thread.sleep(5000);
		  loginPage.clickSignout();
		  Thread.sleep(5000);
		  //loginPage.clickSignIn();
		  loginPage.enterUserName("sonimol12345@yahoo.com");
		  loginPage.clickContinue();
		  Thread.sleep(5000);
		  loginPage.enterPassword("pageobject");
		  loginPage.clickLogin();
		  Thread.sleep(5000);
		  category2ResultPage.clickCart();
		  Thread.sleep(5000);
	 }

}
