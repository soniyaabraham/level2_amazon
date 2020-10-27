package com.ustg.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/div/span")
	private WebElement title;
	@FindBy(id="nav-hamburger-menu")
	private WebElement hamburger;
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[9]/a")
	private WebElement itemMenu;
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[17]/a")
	private WebElement item;
	@FindBy(xpath="//*[@id=\"leftNav\"]/ul[1]/li[2]")
	private WebElement result;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getHomeTitle() {
		return    title.getText();
	}
	public void clickMenu() {
		hamburger.click();
		}
	public void clickItemMenu() {
		itemMenu.click();
		}
	public void clickItem() {
		item.click();
	}
		public String getResult() {
			return    result.getText();
		}


}
