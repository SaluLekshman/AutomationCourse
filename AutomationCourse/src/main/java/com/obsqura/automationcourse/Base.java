package com.obsqura.automationcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	public  WebDriver driver;
	public void initialiseBrowser()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALU\\eclipse workspace\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 
	}
	public void titleCommands()
	{
		String actualtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String title=driver.getTitle();
		if(actualtitle.equals(title))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is not correct");
		}
	}
	public  void getUrlCommand()
	{
		String url=driver.getCurrentUrl();
		String actualurl="https://www.amazon.in/";
		if(actualurl.equals(url))
		{
			System.out.println("Url matched");
			
		}
		else
		{
			System.out.println("Url not matched");
		}
	}
	public void pageSource()
	{
		String pagesource=driver.getPageSource();
		boolean sourcecode=pagesource.contains("<!-- sp:end-feature:head-start -->");
		System.out.println( sourcecode);
		
	
	}
	public void driverClose()
	{
		driver.close();
	}
	public void driverQuit()
	{
		driver.quit();
	}
	public void navigateCommands()
	{
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
	/*
	 * public static void main(String args[]) { Base base=new Base();
	 * base.initialiseBrowser(); base.titleCommands(); base.getUrlCommand();
	 * base.pageSource(); base.driverClose();
	 * 
	 * base.navigateCommands(); //base.driverQuit(); }
	 */
}
