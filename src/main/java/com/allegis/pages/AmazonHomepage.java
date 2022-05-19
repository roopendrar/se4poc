package com.allegis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AmazonHomepage{
	
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	public WebElement navbar;
	
	@FindBy(xpath="//div[text()='Echo & Alexa']")
	public WebElement echo;
	
	@FindBy(xpath="//a[text()='Echo Show 5']")
	public WebElement echoshow;
	
	@FindBy(xpath="//a[text()='Fashion']")
	public WebElement fashion;
	
	public AmazonHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void nav() {
		try {
			navbar.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void econav() {
		try {
			echo.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ecoshow5() {
		try {
			echoshow.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fashiontab() {
		try {
			fashion.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
