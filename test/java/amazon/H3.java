package amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class H3 {
	WebDriver d;
	@Given("user is in dezlearn.com")
	public void user_is_in_dezlearn_com() {
	    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://www.dezlearn.com/javascript-alerts/");
	    d.manage().window().maximize();
	}

	@When("user gets the url and title")
	public void user_gets_the_url_and_title() {
		d.getTitle();
		d.getCurrentUrl();
	   
	}

	@Then("user works on alert")
	public void user_works_on_alert() {
		d.findElement(By.id("s_alert1")).click();
		Alert alt=d.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept();
	   
	}

	@And("user captures screenshot and close the window")
	public void user_captures_screenshot_and_close_the_window() throws IOException {
	   File img=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  Files.copy(img,new File("C:\\Users\\Public\\a7.png"));
	  d.close();
	}


}
