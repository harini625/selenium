package amazon;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class l2 {
	@Given("user is in newtours application")
	public void user_is_in_newtours_application() {
		 System.out.println("user is in new tours application");
	}

	@When("user needs to enter username and pass")
	public void user_needs_to_enter_username_and_pass() {
		 System.out.println("user needs to enter username and pass");
	}

	@Then("user is navigated to search window")
	public void user_is_navigated_to_search_window() {
		 System.out.println("user is navigated to search window");
	}

	@And("user navigated to homepage")
	public void user_navigated_to_homepage() {
	   System.out.println("user navigated to homepage");
	}



}
