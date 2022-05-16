package com.allegis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonEcho {
	
	@FindBy(xpath="//input[@id='gift-wrap']")
	public WebElement gift;
	
	@FindBy(xpath="//a[text()=' Add to Wish List ']")
	public WebElement addtowish;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	public WebElement create;
	
	public AmazonEcho(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	
	public void giftwrap() {
		try {
			gift.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void wishlist() {
		try {
			addtowish.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getext() {
		try {
			create.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
