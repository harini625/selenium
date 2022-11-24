package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class H1 {
	WebDriver d;
	@Given("user opens the web page")
	public void user_opens_the_web_page() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demoqa.com/text-box");
	    d.manage().window().maximize();
	}

	@When("user enters the text")
	public void user_enters_the_text() {
		d.findElement(By.id("userName")).sendKeys("harini");
		d.findElement(By.id("userEmail")).sendKeys("hariniramireddy625@gmail.com");
		d.findElement(By.id("currentAddress")).sendKeys("Nellore district,andhra pradesh");
		d.findElement(By.id("permanentAddress")).sendKeys("Nellore district, Andhra pradesh");
	}

	@Then("user submits the details")
	public void user_submits_the_details() throws InterruptedException {
		//d.findElement(By.id("submit")).click();;
		//WebElement s1=d.findElement(By.id("output"));
		System.out.println("user submits the details");
	}

	@And("user closes the browser")
	public void user_closes_the_browser() {
	    System.out.println("user submits the details");
	    d.close();
	}

}
