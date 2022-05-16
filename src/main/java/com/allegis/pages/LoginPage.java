package com.allegis.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilis.ReadExcel;

public class LoginPage {
	
	@FindBy(id="customer.firstName")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@id='customer.lastName']")
	public WebElement lastname;
	
	@FindBy(name="customer.address.street")
	public WebElement address;
	
	@FindBy(id="customer.address.city")
	public WebElement city;
	
	@FindBy(id="customer.address.state")
	public WebElement state;
	
	@FindBy(id="customer.address.zipCode")
	public WebElement zipcode;
	
	@FindBy(id="customer.phoneNumber")
	public WebElement phonenumber;
	
	@FindBy(id="customer.username")
	public WebElement username;
	
	@FindBy(id="customer.password")
	public WebElement password;
	
	@FindBy(id="repeatedPassword")
	public WebElement confirmpass;
	
	@FindBy(xpath="//input[@type='submit' and @value='Register']")
	public WebElement register;
	
	@FindBy(className="error")
	public WebElement error;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void fname() {

		try {
			 List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			firstname.sendKeys(testDataupdated.get(0).get("firstname"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void lname() {

		try {
			 List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			 lastname.sendKeys(testDataupdated.get(0).get("lastname"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void uaddress() {

		try {
			 List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			 address.sendKeys(testDataupdated.get(0).get("address"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ucity() {

		try {
			 List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			 city.sendKeys(testDataupdated.get(0).get("city"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ustate() {

		try {
			 List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			 state.sendKeys(testDataupdated.get(0).get("s"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void uzipcode() {

		try {
			 List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			 zipcode.sendKeys(testDataupdated.get(0).get("z"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void uphonenumber() {

		try {
			 List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			 phonenumber.sendKeys(testDataupdated.get(0).get("p"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void username() {

		try {
			 List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			 username.sendKeys(testDataupdated.get(0).get("us"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void password() {

		try {
			 List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			 password.sendKeys(testDataupdated.get(0).get("pass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void confirmpass() {

		try {
			 List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			 confirmpass.sendKeys(testDataupdated.get(0).get("cpss"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void register() {
		try {
			register.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
