package com.allegis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonFashionpage {
	
	@FindBy(xpath="//span[contains(text(),'Sportswear')]")
	public WebElement sportswear;
	
	@FindBy(xpath="//a[contains(text(),'Nike')]")
	public WebElement nike;
	
	@FindBy(xpath="//span[contains(text(),\"Men's Chroma Thong 5 Black Flip Flops Sandals-10 UK (11 US) (833808-016)\")]")
	public WebElement nikepage;
	
	
	public AmazonFashionpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// public WebDriver driver;
	// Actions action=new Actions(driver);
	
	public void sportsection() {
		try {
			// action.moveToElement(sportswear).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void nikesec() {
		try {
			// action.moveToElement(nike).click().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void nikepage() {
		try {
			nikepage.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
