package com.pages;

import java.util.List;
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
	
	
	@FindBy(xpath="//input[@id='gh-ac']")
	WebElement searchField;
	
	@FindBy(xpath="//span[normalize-space()='Fiction & Nonfiction Books']")
	WebElement clickonItem;
	
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
//        By.cssSelector(".autocomplete-suggestion")
//    ));

//    // Print all suggestions
//    System.out.println("Search suggestions:");
//    for (WebElement suggestion : suggestions) {
//        System.out.println(suggestion.getText());
//    }

    // Select the desired suggestion (e.g., the first one)
   // suggestions.get(0).click();

	@FindBy(xpath="//ul[@id='ui-id-1']/li")
	List<WebElement> searchList;
	
	@FindBy(xpath="//ul[@class='srp-results srp-list clearfix']/li")
	List<WebElement> bookSelection;
	
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	WebElement addToCartBtn;
	
	
	
	
	
	public CartPage HomePage() throws Exception
	{
		searchField.isDisplayed();
		searchField.sendKeys("book");
		Thread.sleep(1000);
		for( int i =0; i< searchList.size();i++) {
			  System.out.println(searchList.get(i).getText().contains("books used - Fiction & Nonfiction books"));
			  {
				  searchList.get(i).click();
				  break;
			  }
		
			}
	
		Thread.sleep(1000);
		for( int i =0; i< bookSelection.size();i++) {
			//  System.out.println(bookSelection.get(i).getText().contains("The Lost Book of Herbal & Natural Remedies II - A5 Size"));
			  System.out.println(bookSelection.get(i).getText());

			
			{
				  bookSelection.get(1).click();
				  break;
			  }
		
			}
		//bookSelection.click();
		
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		addToCartBtn.click();
//			
		return new CartPage(driver);
		
	}
}

