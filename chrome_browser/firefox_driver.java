package chrome_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.close();
		

	}

}
