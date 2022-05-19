package com.allegis.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.allegis.pages.AmazonEcho;
import com.allegis.pages.AmazonFashionpage;
import com.allegis.pages.AmazonHomepage;
import com.allegis.pages.LoginPage;
import com.allegis.pages.NikeChroma;




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
	

	@Test(priority = 1,enabled = false, description="This a test related to adding a product to the wishlist from amazon" )
	public void amazonwishlist() {
		
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
	
	
	  @Test(enabled=true,priority=2,description="This test method is to add a Nike product to wish list") 
	  public void amazonfashion() throws InterruptedException {
		  AmazonHomepage ahome=new AmazonHomepage(driver);
		  AmazonFashionpage fashion=new AmazonFashionpage(driver);
		  NikeChroma nike=new NikeChroma(driver);
		  Actions action = new Actions(driver);
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		  
		  wait.until(ExpectedConditions.visibilityOf(ahome.fashion));
		  ahome.fashiontab();
		  wait.until(ExpectedConditions.visibilityOf(fashion.sportswear));
		  action.moveToElement(fashion.sportswear).perform();
		  wait.until(ExpectedConditions.visibilityOf(fashion.nike));
		  action.moveToElement(fashion.nike).click().perform();
		  Reporter.log("Nike page is opened and displayed");
		  fashion.nikepage();
		  
		  String parent = driver.getWindowHandle();
		  Set<String> windows = driver.getWindowHandles();
		  Iterator<String> iterator = windows.iterator();
		  
		  while (iterator.hasNext()) {

				String child_window = iterator.next();
				if (!parent.equals(child_window)) {
					driver.switchTo().window(child_window);
					  wait.until(ExpectedConditions.visibilityOf(nike.niketext));
					  Assert.assertTrue(nike.niketext.isDisplayed());
					  nike.nikegettext();
					  nike.checkbox1();
					  nike.checkbox2();
					  nike.checkbox3();
					  nike.addtocartbtn();
					  wait.until(ExpectedConditions.visibilityOf(nike.addtocarttext));
					  Assert.assertTrue(nike.addtocarttext.isDisplayed());
					  Reporter.log("nike chroma flipflop added to the cart successfully");
					  nike.addtocarttext();
					  
		 
					  driver.close();
				}
		  }
	  
	  }
	 
}
