package day_1_methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_browser {
	WebDriver d;
	@AfterMethod
  public void opening_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sowjanya\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
  }
	@Test
	public void title()
	{
		System.out.println(d.getTitle());
	}
	@BeforeMethod
	public void url()
	{
		System.out.println(d.getCurrentUrl());
	}
	//@Test
	//public void Screenshot() throws IOException
	//{
		//File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(a1,new File("C:\\Users\\Sowjanya\\Downloads\\a5.png"));
		
	//}
}
