package amazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class H4 {
	WebDriver d;
	@Given("user is in newtours")
	public void user_is_in_newtours() throws IOException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/index.php");
		d.manage().window().maximize();
		
	   
	}

	@When("user needs to enter name and password")
	public void user_needs_to_enter_name_and_password() throws InterruptedException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\Sowjanya\\eclipse-workspace\\project1\\src\\test\\java\\amazon\\H4.properties");
		Properties p1=new Properties();
		p1.load(f1);
		d.findElement(By.name("userName")).sendKeys(p1.getProperty("username"));
		d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
	}
	@Then("user submits the page")
	public void user_submits_the_page() throws InterruptedException {
	    d.findElement(By.name("submit")).click();
	    Thread.sleep(2000);
	}

	@And("user closes the window")
	public void user_closes_the_window() {
	    d.close();
	}
}
