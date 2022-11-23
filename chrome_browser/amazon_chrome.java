package chrome_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.close();
		

	}

}
