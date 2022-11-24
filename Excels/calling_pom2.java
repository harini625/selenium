package Excels;

import org.openqa.selenium.chrome.ChromeDriver;

public class calling_pom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		String baseurl="https://demo.guru99.com/selenium/newtours/register.php";
		d.get(baseurl);
		d.manage().window().maximize();
		pom2 p2=new pom2(d);
		p2.Fname();
		p2.lname();
		p2.phone();

	}

}
