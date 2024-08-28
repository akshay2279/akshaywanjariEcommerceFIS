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
import com.pages.LoginPage;
import com.utilities.DriverUtils;

public class LoginTest extends BaseClass{

	LoginPage lp=null;

	@BeforeSuite
	public void setup()throws Exception {
		initialization();
		reportInit();
		lp= new LoginPage(driver);
	}
	
	
	@Test(groups = { "sanity","regression"})
	public void homescreen() throws Exception {
		lp.validLogin01();
		Assert.assertEquals(driver.getTitle(), "EdAssist by Bright Horizons | Bright Horizons®");
	    lp.search();
	}	
}
