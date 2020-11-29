package com.selenium.testcases.selenium_project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCasesCSS {

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
		w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys("admin");//Full  Xpath  
		w.findElement(By.xpath("//*[@id=\"passw\"]")).sendKeys("admin");//Relative XPath
		w.findElement(By.xpath("//*[@id=\"login\"]/table/tbody/tr[3]/td[2]/input")).click();
		w.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr[1]/td[2]/a[1]")).click();
		
		System.out.println("Test Cases  Executed ......");
		
		//Quit the browser
		w.quit();
		

	}

}
