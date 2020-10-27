package com.ustg.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	static WebDriver driver;
	@FindBy(id="add-to-cart-button")
	private WebElement addbtn;
	//@FindBy(xpath="//*[@id=\"nav-cart\"]")
	//@FindBy(xpath="//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")
	@FindBy(id="hlb-view-cart-announce")
	
	private WebElement cartbtn;
	@FindBy(name="quantity")
	private WebElement  qty;
	
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickAddToCart() {
		addbtn.click();
		}
	public void clickCart() {
		cartbtn.click();
		}
	public void clickQty(String value) {
		Select selectqty=new Select(qty);
		selectqty.selectByValue(value);
		}

}
