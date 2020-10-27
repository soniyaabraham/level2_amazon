package com.ustg.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id="nav-link-accountList")
	public WebElement loginlink;
	@FindBy(id="ap_email")
	private WebElement emailid;
	@FindBy(id="continue")
	private WebElement continuebtn;
	@FindBy(id="ap_password")
	private WebElement password;
	@FindBy(id="signInSubmit")
	private WebElement loginbtn;
	@FindBy(id="nav-item-signout")
	private WebElement signout;
	static WebDriver driver;

	public LoginPage(WebDriver driver) {
		driver =this.driver;
		// TODO Auto-generated constructor stub
	}
	public void clickSignIn() {
		loginlink.click();	
	}
	

public void enterUserName(String text) {
	emailid.sendKeys(text);
	}
	
public void clickContinue() {
	continuebtn.click();
	}
public void enterPassword(String text) {
	password.sendKeys(text);
	}
public void clickLogin() {
	loginbtn.click();
	}
public void clickSignout() {
	signout.click();
	}
}
