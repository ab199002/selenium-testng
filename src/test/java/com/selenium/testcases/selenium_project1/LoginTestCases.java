package com.selenium.testcases.selenium_project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCases {

	public static void main(String[] args) 
	{
		//interfaceName instance = new Implementing className
		
		String projectpath =System.getProperty("user.dir");//this  will give  project path 
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\Maven\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver w = new ChromeDriver();//Open Blank  Chrome Browser
		
		//steps
		w.get("http://demo.testfire.net/bank/login.aspx");
		w.manage().window().maximize();//maximize the browser window
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.id("passw")).sendKeys("admin");
		w.findElement(By.name("btnSubmit")).click();
		w.findElement(By.linkText("Sign Off")).click();//using link text we use real ui name of link
		
		System.out.println("Test Cases  Executed ......");
		
		//Quit the browser
		w.quit();
		

	}

}
