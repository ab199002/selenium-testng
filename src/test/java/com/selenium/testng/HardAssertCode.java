package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HardAssertCode {
  
	String projectpath =System.getProperty("user.dir");//this  will give  project path 
	WebDriver w ;
  
  @BeforeTest
  public void beforeTest() 
  {
	  
	 System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver.exe");
	 w= new ChromeDriver();//Open Blank  Chrome Browser
  }
  
  @Test(priority = 0,description = "Test case to verify login functionnality  'Admin' user.")
  public void loginAdmin() 
  {
	    w.get("http://demo.testfire.net/bank/login.aspx");
	    w.manage().window().maximize();//maximize the browser window
	    String currentpagetitle=w.getTitle();
	    Assert.assertEquals(currentpagetitle, "Altoro Mutual");
		
	    String loginlable = w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/h1")).getText();
		Assert.assertTrue(loginlable.contains("Login"),"Having different lable");
		
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.id("passw")).sendKeys("admin");
		w.findElement(By.name("btnSubmit")).click();
		
		
		System.out.println("Test Cases  Executed ......");
  }
  
  @Test(priority = 1,description = "Test case to verify login functionnality  'Admin' user.")
  public void logoutAdmin() 
  {
	  	String currentpagetitle=w.getTitle();
	    Assert.assertEquals(currentpagetitle, "Altoro Mutual");
		
	    String loginlable = w.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/h1")).getText();
		Assert.assertTrue(loginlable.contains("Admin"),"Having different lable");
		
	  w.findElement(By.linkText("Sign Off")).click();
  }
  @AfterTest
  public void afterTest() 
  {
	  w.quit();
  }

}
