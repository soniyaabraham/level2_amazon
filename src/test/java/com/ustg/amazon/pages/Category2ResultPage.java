package com.ustg.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Category2ResultPage {
	WebDriver driver;
	//@FindBy(id="nav-hamburger-menu")
	//private WebElement hamburger;
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul/li[10]/a")
	private WebElement category;
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[5]/a")
	private WebElement menu;
	@FindBy(name="s-ref-checkbox-6631678031")
	private WebElement headphone;
	@FindBy(xpath="//*[@id=\"p_36/1318505031\"]/span/a")
	private WebElement price;
	@FindBy(xpath="//*[@id=\"p_n_feature_three_browse-bin/13943168031\"]/span/a/div/label/i")
	private WebElement vol;
	@FindBy(xpath="//*[@id=\"p_n_feature_three_browse-bin/6631677031\"]/span/a/div/label/i")
	private WebElement wireless;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a")
	private WebElement item;
	@FindBy(xpath="//*[@id=\"nav-cart\"]")
	private WebElement cart;
			
		public Category2ResultPage(WebDriver driver) {
		this.driver = driver;
	}
	//public void clickHam() {
		//hamburger.click();
		//}
	
	public void clickCategory() {
		category.click();
		}
	public void clickMenu() {
		menu.click();
	}
	public void clickItem() {
		headphone.click();
	}
	public void clickPrice() {
		price.click();
	}
	public void clickFeature1() {
		vol.click();
	}
	public void clickFeature2() {
		wireless.click();
	}
	public void selectItem() {
		item.click();
	}
	public void clickCart() {
		cart.click();
	}
}
