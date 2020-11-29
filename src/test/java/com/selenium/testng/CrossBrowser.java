package com.selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver w;
	String projectpath =System.getProperty("user.dir");//this  will give
  @Test(priority = 0)
  public void chrome() 
  {
	  System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver.exe");
	  w= new ChromeDriver();//Open Blank  Chrome Browser
	  w.get("https://www.google.co.in/");
	  w.quit();
  }
  @Test(priority = 1)
  public void firefox() {
	  System.setProperty("webdriver.gecko.driver", projectpath+"\\Drivers\\geckodriver.exe");
	  w= new FirefoxDriver();//Open Blank  Chrome Browser
	  w.get("https://www.google.co.in/");
	  w.quit();
  }
  @Test(priority = 2)
  public void edge() {
	  System.setProperty("webdriver.edge.driver", projectpath+"\\Drivers\\msedgedriver.exe");
	  w= new EdgeDriver();//Open Blank  Chrome Browser
	  w.get("https://www.google.co.in/");
	  w.quit();
  }
}
