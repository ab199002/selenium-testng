package com.selenium.webobject;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowser_Dim {
	WebDriver w;
	String projectpath =System.getProperty("user.dir");//this  will give
  @Test(priority = 0)
  public void chrome() 
  {
	  System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver.exe");
	  w= new ChromeDriver();//Open Blank  Chrome Browser
	  org.openqa.selenium.Dimension dim = new org.openqa.selenium.Dimension(800, 800);
	  w.manage().window().setSize(dim);
	  //w.manage().window().maximize();//maximize the winndow
	  w.get("https://www.google.co.in/");
	  
	  w.quit();
  }
  @Test(priority = 1)
  public void firefox() {
	  System.setProperty("webdriver.gecko.driver", projectpath+"\\Drivers\\geckodriver.exe");
	  w= new FirefoxDriver();//Open Blank  Chrome Browser
	  org.openqa.selenium.Dimension dim = new org.openqa.selenium.Dimension(800, 400);
	  w.manage().window().setSize(dim);
	  w.get("https://www.google.co.in/");
	  w.quit();
  }
  @Test(priority = 2)
  public void edge() {
	  System.setProperty("webdriver.edge.driver", projectpath+"\\Drivers\\msedgedriver.exe");
	  w= new EdgeDriver();//Open Blank  Chrome Browser
	  w.manage().window().maximize();//this will maximize the browser
	  w.get("https://www.google.co.in/");
	  
	  w.quit();
  }
}
