package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.utilities.DriverUtils;
import com.utilities.ExcelUtils;

public class ContactUsPage  {

	WebDriver driver=null;
	
	public ContactUsPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class='navbar7_link w-nav-link'][normalize-space()='Contact']")
	WebElement contactBtn;
	
	@FindBy(xpath="//form[@name='Form']//input[@id='email']")
	WebElement emailField;
	
	@FindBy(xpath="//form[@name='Form']//input[@id='firstname']")
	WebElement firstNameField;
	
	@FindBy(xpath="//form[@name='Form']//input[@id='lastname']")
	WebElement lastNameField;
	
	@FindBy(xpath="//form[@name='Form']//input[@id='company']")
	WebElement companyNameField;
	
	@FindBy(xpath="//div[@class='form_field-wrapper']//select[@id='message_type']")
	WebElement messageType;
	
	@FindBy(xpath="//form[@name='Form']//input[@name='384607520']")
	WebElement checkBox;
	
	@FindBy(xpath="//div[@class='margin-top margin-small']//button[@type='submit'][normalize-space()='Submit']")
	WebElement submitBtn;
	
	
	@FindBy(xpath="//a[@class='button is-small w-button']")
	WebElement bookADemoProduct;
	
	@FindBy(xpath="//a[@class='button is-small w-button']")
	WebElement bookADemoviaSector;
	
	@FindBy(xpath="//a[@class='button is-small w-button']")
	WebElement bookADemoviaContentHub;
	
	@FindBy(xpath="//a[@class='button is-small w-button']")
	WebElement bookADemoviaContact;
	
	@FindBy(xpath="	//div[normalize-space()='Form Submission Failed']")
	WebElement formSubmitFailedError;
	
	
	
	
	public void contatUsScreen() throws Exception
	{
		contactBtn.click();
		emailField.sendKeys("akshay.wanjari09@gmail.com");
		firstNameField.sendKeys("Akshay");
		lastNameField.sendKeys("Wanjari");
		companyNameField.sendKeys("PhonePe");
		messageType.click();
		
		 Select select = new Select(messageType);

	        // Select an option by visible text
	        select.selectByVisibleText("Marketing");
		
	        if (!checkBox.isSelected()) {
	            checkBox.click();
	        }
	        
	        
	        submitBtn.click();
		
	        formSubmitFailedError.isDisplayed();
		
		
	}
}

