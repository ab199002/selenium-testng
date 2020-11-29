package com.selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser_webdrivermanager {
	WebDriver w;
	String projectpath =System.getProperty("user.dir");//this  will give
  @Test(priority = 0)
  public void chrome() 
  {
	  WebDriverManager.chromedriver().setup();
	  w= new ChromeDriver();//Open Blank  Chrome Browser
	  w.get("https://www.google.co.in/");
	  w.quit();
  }
  @Test(priority = 1)
  public void firefox() {
	  WebDriverManager.firefoxdriver().setup();
	  w= new FirefoxDriver();//Open Blank  Chrome Browser
	  w.get("https://www.google.co.in/");
	  w.quit();
  }
  @Test(priority = 2)
  public void edge() {
	  WebDriverManager.edgedriver().setup();
	  w= new EdgeDriver();//Open Blank  Chrome Browser
	  w.get("https://www.google.co.in/");
	  w.quit();
  }
}
