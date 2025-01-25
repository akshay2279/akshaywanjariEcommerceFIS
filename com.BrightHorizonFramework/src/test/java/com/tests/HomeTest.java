package com.tests;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.CartPage;
import com.pages.HomePage;
import com.utilities.DriverUtils;

public class HomeTest extends BaseClass{

	HomePage lp=null;
CartPage cp = null;
	@BeforeSuite
	public void setup()throws Exception {
		initialization();
		reportInit();
		lp= new HomePage(driver);
		cp= new CartPage(driver);

	}
	
	
	@Test(groups = { "sanity","regression"})
	public void homescreen() throws Exception {
		lp.HomePage();
		//Assert.assertEquals(driver.getTitle(), "Tendable");
		
		//cp.contatUsScreen();
	 
	}	
}
