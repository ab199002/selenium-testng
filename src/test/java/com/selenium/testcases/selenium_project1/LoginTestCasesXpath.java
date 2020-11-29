package com.selenium.testcases.selenium_project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCasesXpath {

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
		w.findElement(By.cssSelector("input#uid")).sendKeys("admin");//using css with id  
		w.findElement(By.cssSelector("input#passw")).sendKeys("admin");
		w.findElement(By.cssSelector("input[name='btnSubmit']")).click();//using css with name 
		w.findElement(By.cssSelector("a#LoginLink")).click();
		
		System.out.println("Test Cases  Executed ......");
		
		//Quit the browser
		w.quit();
		

	}

}
