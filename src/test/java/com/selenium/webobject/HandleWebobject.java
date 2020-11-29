package com.selenium.webobject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class HandleWebobject 
{
	WebDriver w;
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
  }
  
  @Test(priority=0,description="Handle textbox")
  public void textBox() {
	  
	  w.get("http://demo.automationtesting.in/Register.html");
	  
	  w.findElement(By.cssSelector("input[ng-model='FirstName']")).clear();
	  w.findElement(By.cssSelector("input[ng-model='FirstName']")).sendKeys("Selenium");
	  
	  w.findElement(By.cssSelector("input[ng-model='LastName']")).clear();
	  w.findElement(By.cssSelector("input[ng-model='LastName']")).sendKeys("Tool");
	
	  w.findElement(By.cssSelector("textarea[ng-model='Adress']")).clear();
	  w.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Test Location");
	  
	  w.findElement(By.cssSelector("textarea[ng-model='EmailAdress']")).clear();
	  w.findElement(By.cssSelector("textarea[ng-model='EmailAdress']")).sendKeys("test@test.com");
	  
	  w.findElement(By.cssSelector("textarea[ng-model='Phone']")).clear();
	  w.findElement(By.cssSelector("textarea[ng-model='Phone']")).sendKeys("9828088878");
	  
  }
  
  @Test(priority=1,description="Handle radiobutton")
  public void radioButton() {
	  
	  w.findElement(By.cssSelector("input[value='FeMale']")).click();
	  
  }
  
  @Test(priority=2,description="Handle checkbox")
  public void checkBox() {
	  
	  w.findElement(By.cssSelector("input[value='Cricket']")).click();
	  w.findElement(By.cssSelector("input[value='Movies']")).click();	  
  }
  
  @Test(priority=3,description="Handle drop-down list")
  public void dropDown() {
	  
	  WebElement Skills=w.findElement(By.id("Skills"));
	  WebElement country=w.findElement(By.id("countries"));
       
	  Select sel,con;	  
	  sel=new Select(Skills);
	  con = new Select(country);
	  
	 // sel.selectByIndex(5);
	  
	//  sel.selectByValue("Android");
	  
	  sel.selectByVisibleText("Excel");
	  con.selectByVisibleText("India");
  }

  @AfterTest
  public void afterTest() {
  }

}
