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
	
	
	@FindBy(xpath="//button[contains(text(),'Accept All')]")
	WebElement acceptAllBtn;
	
	@FindBy(xpath="//a[@class='button track_cta_click home_lazy_edassist']")
	WebElement learnBtn;
	
	@FindBy(xpath="//a[@class='nav-link-search track_nav_interact']//span[@class='icon-search bhc-icon-search-rounded']")
	WebElement search;
	
	@FindBy(xpath="//nav[@id='subnav-search-desktop-top']//input[@id='search-field']")
	WebElement searchField;
	
	@FindBy(xpath="//nav[@id='subnav-search-desktop-top']//button[@type='submit'][normalize-space()='Search']")
	WebElement searchBtn;
	
	@FindBy(xpath="//h3[text()='Employee Education in 2018: Strategies to Watch']")
	WebElement firstresultverification;
	
	@FindBy(xpath="//input[@id= 'signInSubmit']")
	WebElement signInBtn;
	
	@FindBy(xpath="//nav[@class='nav-shared txt-nav-hierarchy nav-top js-nav-shared js-nav-top']//li[@class='nav-item displayed-mobile']//a[@class='btn-nav btn btn-large btn-hollow color-nileblue global_header_findcenter track_cta_click'][normalize-space()='Find a Center']")
	WebElement findCenterBtn;
	
	
	@FindBy(xpath="//input[@id='addressInput']")
	WebElement searchText;
	
	
	
	
	
	
	
	public void validLogin01() throws Exception
	{
		acceptAllBtn.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		js.executeScript("window.scrollBy(0,2150)", "");
		DriverUtils.waitForElement(learnBtn, 10);
		learnBtn.click();
		        String textToCheck = "edassist";

        // Get the current URL
        String currentURL = driver.getCurrentUrl();

        // Check if the URL contains the specified text
        if (currentURL.contains(textToCheck)) {
            System.out.println("The URL contains the text: " + textToCheck);
        } else {
            System.out.println("The URL does not contain the text: " + textToCheck);
        }
		}
	
	public void search() {
		search.click();;
		searchField.sendKeys("Employee Education in 2018");
		searchBtn.click();
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//nav[@class='nav-shared txt-nav-hierarchy nav-top js-nav-shared js-nav-top']//li[@class='nav-item displayed-desktop']//a[@class='btn-nav btn btn-large btn-hollow color-nileblue global_header_findcenter track_cta_click'][normalize-space()='Find a Center']"))).click();

	//	findCenterBtn.click();
		searchText.sendKeys("NewYork");
		searchText.click();
		
		// Get the actual text from the element
        String actualText = firstresultverification.getText();

        // The expected text
        String expectedText = "Employee Education in 2018: Strategies to Watch";

        // Assert that the actual text matches the expected text
        Assert.assertEquals(actualText, expectedText, "Text does not match!");
		
	}		
	}

