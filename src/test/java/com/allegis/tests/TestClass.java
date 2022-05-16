package com.allegis.tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.allegis.pages.AmazonEcho;
import com.allegis.pages.AmazonHomepage;
import com.allegis.pages.LoginPage;




public class TestClass extends TestBase{

	@Test(enabled=false, description="this is regarding the login of the demo website parabank")
	public void login() throws IOException, InterruptedException {
		
		LoginPage login=new LoginPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		
		wait.until(ExpectedConditions.visibilityOf(login.firstname));
		login.fname();
		Reporter.log("firstname entered");
		wait.until(ExpectedConditions.visibilityOf(login.lastname));
		login.lname();
		Reporter.log("lastname entered");
		wait.until(ExpectedConditions.visibilityOf(login.address));
		login.uaddress();
		Reporter.log("address entered");
		wait.until(ExpectedConditions.visibilityOf(login.city));
		login.ucity();
		Reporter.log("city entered");
		wait.until(ExpectedConditions.visibilityOf(login.state));
		login.ustate();
		Reporter.log("state entered");
		wait.until(ExpectedConditions.visibilityOf(login.zipcode));
		login.uzipcode();
		Reporter.log("zipcode entered");
		wait.until(ExpectedConditions.visibilityOf(login.phonenumber));
		login.uphonenumber();
		Reporter.log("phonenumber entered");
		wait.until(ExpectedConditions.visibilityOf(login.username));
		login.username();
		Reporter.log("username entered");
		wait.until(ExpectedConditions.visibilityOf(login.password));
		login.password();
		Reporter.log("password entered");
		wait.until(ExpectedConditions.visibilityOf(login.confirmpass));
		login.confirmpass();
		Reporter.log("confirm password entered");
		wait.until(ExpectedConditions.visibilityOf(login.register));
		login.register();
		Reporter.log("register button clicked");
		Reporter.log("User account registered successfully");
		
		wait.until(ExpectedConditions.visibilityOf(login.error));
		Assert.assertTrue(login.error.isDisplayed());
		
//		String title=driver.getTitle();
//		Assert.assertEquals(title, "ParaBank | Register for Free Online Account Access");
//		System.out.println("The title of the page is "+ title); 
		
		Thread.sleep(10000);

		Reporter.log("waited for 5 sec and tab closed");
		
		driver.close();
	}
	

	@Test(priority = 1,enabled = true, description="This a test related to adding a product to the wishlist from amazon" )
	public void amazon() {
		
		AmazonHomepage ahome=new AmazonHomepage(driver);
		AmazonEcho echo=new AmazonEcho(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.visibilityOf(ahome.navbar));
		ahome.nav();
		wait.until(ExpectedConditions.visibilityOf(ahome.echo));
		ahome.econav();
		wait.until(ExpectedConditions.visibilityOf(ahome.echoshow));
		ahome.ecoshow5();
		
		wait.until(ExpectedConditions.visibilityOf(echo.gift));
		echo.giftwrap();
		echo.wishlist();
		wait.until(ExpectedConditions.visibilityOf(echo.create));
		echo.getext();
		
		Assert.assertTrue(echo.create.isDisplayed());
		Reporter.log("The create amazon account text displayed");
		//Assert.assertEquals(echo.create, " Create your Amazon account ");
		
		driver.close();
	}
}
