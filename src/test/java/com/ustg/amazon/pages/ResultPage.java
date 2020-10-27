package com.ustg.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ResultPage {
	
	@FindBy(xpath="//*[@id=\"leftNav\"]/ul[3]/div/li[4]/span/a/span")
	private WebElement price;
	@FindBy(xpath="//*[@id=\"p_89/Dell\"]/span/a/div/label/i")
	private WebElement brand;
	@FindBy(xpath="//*[@id=\"p_n_feature_fourteen_browse-bin/2917526031\"]/span/a/div/label/i")
	private WebElement display;
	@FindBy(xpath="//*[@id=\"p_72/1318476031\"]/span/a/section/i")
	private WebElement rating;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a")
	//@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a")
	private WebElement item;
	
	static WebDriver driver;
	
	public ResultPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void clickPrice() {
		price.click();	
	}
	public void clickBrand() {
		brand.click();
		}
	public void clickDisplay() {
		display.click();
		}
	public void clickRating() {
		rating.click();
		}
	public void clickItem() {
		item.click();
		}
	
	
	

}
