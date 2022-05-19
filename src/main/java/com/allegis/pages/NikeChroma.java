package com.allegis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NikeChroma {
	
	@FindBy(xpath="//span[@id='productTitle']")
	public WebElement niketext;
	
	@FindBy(xpath="//input[@value='B088ZKV2MY']")
	public WebElement checkbox1;
	
	@FindBy(xpath="//input[@id='abb-option-offerId-B08HM3LGTK']")
	public WebElement checkbox2;
	
	@FindBy(xpath="//input[@id='abb-option-offerId-B08R6QR863']")
	public WebElement checkbox3;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	public WebElement addtocart;
	
	@FindBy(xpath="//span[contains(text(),\"Added to Cart\")]")
	public WebElement addtocarttext;
	
	public NikeChroma(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void nikegettext() {
		try {
			niketext.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkbox1() {
		try {
			checkbox1.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkbox2() {
		try {
			checkbox2.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkbox3() {
		try {
			checkbox3.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addtocartbtn() {
		try {
			addtocart.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addtocarttext() {
		try {
			addtocarttext.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
