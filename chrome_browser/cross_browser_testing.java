//counting no of links and printing those links
package chrome_browser;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cross_browser_testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/selenium/newtours/index.php");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		WebElement a=d.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody"));
		List<WebElement>b=a.findElements(By.tagName("a"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
		}

	}

}
