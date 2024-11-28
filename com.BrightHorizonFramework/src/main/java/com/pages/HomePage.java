package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.utilities.DriverUtils;
import com.utilities.ExcelUtils;

public class HomePage  {

	WebDriver driver=null;
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@aria-label='home']//img[@class='navbar7_logo']")
	WebElement tendableTitle;
	
	@FindBy(xpath="//a[@class='navbar7_link w-nav-link'][normalize-space()='About']")
	WebElement aboutBtn;
	
	@FindBy(xpath="//a[@class='navbar7_link w-nav-link'][normalize-space()='Products']")
	WebElement product;
	
	@FindBy(xpath="//a[@class='navbar7_link w-nav-link'][normalize-space()='Sectors']")
	WebElement sector;
	
	@FindBy(xpath="//a[@class='navbar7_link w-nav-link'][normalize-space()='Content Hub']")
	WebElement contentHub;
	
	@FindBy(xpath="//a[@class='navbar7_link w-nav-link'][normalize-space()='Contact']")
	WebElement contact;
	
	@FindBy(xpath="//a[@class='button is-small w-button']")
	WebElement bookADemoHome;
	
	@FindBy(xpath="//a[@class='button is-small w-button']")
	WebElement bookADemoFromAbout;
	
	
	@FindBy(xpath="//a[@class='button is-small w-button']")
	WebElement bookADemoProduct;
	
	@FindBy(xpath="//a[@class='button is-small w-button']")
	WebElement bookADemoviaSector;
	
	@FindBy(xpath="//a[@class='button is-small w-button']")
	WebElement bookADemoviaContentHub;
	
	@FindBy(xpath="//a[@class='button is-small w-button']")
	WebElement bookADemoviaContact;
	
	
	
	public ContactUsPage HomePage() throws Exception
	{
		tendableTitle.isDisplayed();
		aboutBtn.isDisplayed();
		product.isDisplayed();
		sector.isDisplayed();
		contentHub.isDisplayed();
		contact.isDisplayed();
		bookADemoHome.isEnabled();
		bookADemoFromAbout.isDisplayed();
		bookADemoProduct.isEnabled();
		bookADemoviaSector.isEnabled();
		bookADemoviaContentHub.isEnabled();
		bookADemoviaContact.isEnabled();
		
		return new ContactUsPage(driver);
		
	}
}

