package chrome_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class text_in_textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sowjanya\\Downloads\\chromedriver_win32 (3)//chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/selenium/newtours/index.php");
		d.manage().window().maximize();
		d.findElement(By.linkText("REGISTER")).click();
		d.findElement(By.name("firstName")).sendKeys("harini");
		d.findElement(By.name("lastName")).sendKeys("ramireddy");

	}

}
