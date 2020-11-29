package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TakeScreenShot12 {
	  WebDriver w;
	  String projectPath = System.getProperty("user.dir");
	  String screenSjotPath;
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  w= new ChromeDriver();//Open Blank  Chrome Browser
	  
  }
  @Test
  public void f() throws Exception 
  {
	  w.get("https://www.google.com");
	  screenSjotPath = projectPath+"\\ScreenShots\\google.png";
	  TakesScreenshot ts  = (TakesScreenshot)w;//create instance of TakeScreenshot interface
	  File fin = ts.getScreenshotAs(OutputType.FILE);
	  
	  FileUtils.copyFile(fin, new File(screenSjotPath));
  }

  @AfterTest
  public void afterTest() {
  }

}
