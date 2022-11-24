package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class l3 {
	WebDriver d;
	@Given("user is in amazon page")
	public void user_is_in_amazon_page() {
	    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
	    //d.get("https://www.amazon.com/");
	    d.get("https://www.google.com");
	    d.manage().window().maximize();
	}

	@When("user selects dropdown")
	public void user_selects_dropdown() {
		//d.findElement(By.id("searchDropdownBox")).sendKeys("books");
	   //System.out.println("user selects dropdown");
		d.findElement(By.name("q")).sendKeys("manual testing");
	}

	@Then("user clicks button")
	public void user_clicks_button() throws InterruptedException {
		//d.findElement(By.id("twotabsearchtextbox")).sendKeys("harrypoter");
		Thread.sleep(2000);
		d.findElement(By.name("btnK")).click();
	    
	}

	@And("user navigate to homepage")
	public void user_navigate_to_homepage() {
		System.out.println("user navigated to homme page");
		d.close();
	   
	}


}
