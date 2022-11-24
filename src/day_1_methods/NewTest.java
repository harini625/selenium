package day_1_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver d;
  @Test
  public void openUrl() {
	  System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	  d=new ChromeDriver();
	  
  }
}
