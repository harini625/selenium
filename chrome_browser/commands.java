package chrome_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sowjanya\\Downloads\\chromedriver_win32 (3)//chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//loading a page 
		d.get("https://www.amazon.com/");
		//maximizing a window
		d.manage().window().maximize();
		//to print current page title
		System.out.println(d.getTitle());
		//to print the current page url
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("searchDropdownBox")).sendKeys("deals");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		//d.findElement(By.id("nav-search-submit-button")).click();
		Boolean selected=d.findElement(By.id("nav-search-submit-button")).isSelected();
		System.out.println(selected);
		Boolean displayed=d.findElement(By.id("nav-search-submit-button")).isDisplayed();
		System.out.println(displayed);
		Boolean enabled=d.findElement(By.id("nav-search-submit-button")).isEnabled();
		System.out.println(enabled);
		d.close();
		
	}

}
