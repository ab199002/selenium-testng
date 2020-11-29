package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginTC {
	String projectpath =System.getProperty("user.dir");//this  will give  project path 
	WebDriver w ;
  
  @BeforeTest
  public void beforeTest() 
  {
	  
	 //System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver.exe");
	  WebDriverManager.chromedriver().setup();
	 w= new ChromeDriver();//Open Blank  Chrome Browser
  }
  
  @Test(priority = 1,description = "Test case to verify login functionnality  'Admin' user.")
  public void loginAdmin() 
  {
	  w.get("http://demo.testfire.net/bank/login.aspx");
		w.manage().window().maximize();//maximize the browser window
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.id("passw")).sendKeys("admin");
		w.findElement(By.name("btnSubmit")).click();
		w.findElement(By.linkText("Sign Off")).click();//using link text we use real ui name of link
		
		System.out.println("Test Cases  Executed ......");
  }
  
  @Test(priority = 0,description = "Test case to verify login functionnality  'Test' user.")
  public void loginTestUser() 
  {
	  w.get("http://demo.testfire.net/bank/login.aspx");
		w.manage().window().maximize();//maximize the browser window
		w.findElement(By.id("uid")).sendKeys("tuser");
		w.findElement(By.id("passw")).sendKeys("tuser");
		w.findElement(By.name("btnSubmit")).click();
		w.findElement(By.linkText("Sign Off")).click();//using link text we use real ui name of link
		
		System.out.println("Test Cases  Executed ......");
  }

  @AfterTest
  public void afterTest() 
  {
	  w.quit();
  }

}
