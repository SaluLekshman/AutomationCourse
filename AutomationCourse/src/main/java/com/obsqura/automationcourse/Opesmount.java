package com.obsqura.automationcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opesmount {
	public  WebDriver driver;
	public void initialiseBrowser()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALU\\eclipse workspace\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 
	}
	public void titleCommands()
	{
		String actualtitle="https://www.flipkart.com/";
		String title=driver.getTitle();
		System.out.println(title);
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
	}
	/*
	 * public static void main(String args[]) { Opesmount opesmount=new Opesmount();
	 * opesmount.initialiseBrowser(); opesmount.titleCommands();
	 * //opesmount.getUrlCommand(); }
	 */
	

}
