package com.selenium.keyworddriven;

import org.testng.annotations.Test;

import com.selenium.pageobjects.FDObject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterTest;
@Listeners(com.selenium.pageobjects.ListenerCode.class)
public class FDTestCase {

	FDObject fd = new FDObject();

	@BeforeTest
	public void beforeTest() {
		
	 fd.openBrowser("chrome");
	 fd.exportPageFactory();
		
	}

	@Test(priority=0,description="Test cases to verify fixed depoist amount for 2000")
	public void fdAmount()throws Exception {
		
		fd.openBaseUrl();
		fd.typeValue(fd.txtPrincipal, "2000");
		fd.typeValue(fd.txtInterest, "10");
		fd.typeValue(fd.txtTenure, "1");
		fd.handledropDown(fd.dropDowntenurePeriod, "year(s)");
		fd.handledropDown(fd.dropDownfrequency, "Simple Interest");
		fd.btnClick(fd.btnCalculate);
		fd.pause(2);
		String maturityValue=fd.returnText(fd.maturityValue);
		System.out.println("Maturity Value : "+maturityValue);
		//fd.captureScreenshot("fdAmount");
	}

	@AfterTest
	public void afterTest() {
		
		fd.closeBrowser();
	}

}
