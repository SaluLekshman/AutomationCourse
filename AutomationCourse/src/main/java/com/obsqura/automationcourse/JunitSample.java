
	package com.obsqura.automationcourse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class JunitSample {
		public  WebDriver driver;
		@Before
		public void initialiseBrowser()
		
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALU\\eclipse workspace\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe");
			driver=new ChromeDriver();
			 driver.get("https://www.amazon.in");
			 
		}
		@Test
		public void titleCommands()
		{
			String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			String actualtitle=driver.getTitle();
			assertEquals(expectedtitle,actualtitle);
			
		}
		@Test
		public  void getUrlCommand()
		{
			String url=driver.getCurrentUrl();
			String actualurl="https://www.amazon.in/";
			assertTrue(actualurl.contains(url));
			/*
			 * if(actualurl.equals(url)) { System.out.println("Url matched");
			 * 
			 * } else { System.out.println("Url not matched"); }
			 */
		}
		@Test
		public void pageSource()
		{
			String expectedPagesource="<!-- sp:end-feature:head-start -->";
			String pagesource=driver.getPageSource();
			assertTrue(pagesource.contains(expectedPagesource));
			
	
		}
	
		public void driverClose()
		{
			driver.close();
		}
		@After
		public void driverQuit()
		{
			driver.quit();
		}
		@Test
		public void navigateCommands()
		{
			driver.navigate().to("https://www.flipkart.com/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			
		}
		
	}


