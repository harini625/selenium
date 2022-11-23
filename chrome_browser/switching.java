package chrome_browser;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switching {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String browser=sc.next();
		switch(browser)
		{
		case "a":
			System.setProperty("webdriver.crome.driver","C://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://www.amazon.com/");
			d.manage().window().maximize();
			Thread.sleep(2000);
			break;
		case "b":
			System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
			FirefoxDriver f=new FirefoxDriver();
			f.get("https://www.amazon.com/");
			f.manage().window().maximize();
			Thread.sleep(2000);
			break;
		
		default:
			System.out.println("invalid browser");
			
		}

	}

}
