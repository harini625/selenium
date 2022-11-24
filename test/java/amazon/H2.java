package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class H2 {
	WebDriver d;

@Given("user is in neew tours")
public void user_is_in_neew_tours() {
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://demo.guru99.com/selenium/newtours/login.php");
	d.manage().window().maximize();
    
}

@When("user specifies mercury and mercury123")
public void user_specifies_mercury_and_mercury123() {
	
   
}

@Then("user click on the submit button")
public void user_click_on_the_submit_button() {
    
}

@And("user back to home page")
public void user_back_to_home_page() {
    
}


}
