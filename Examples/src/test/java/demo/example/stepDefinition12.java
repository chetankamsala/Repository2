package demo.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition12 {
	@Given("Admin enters Adminid {string} in the field")
	public void admin_enters_Adminid_in_the_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(string);
	}

	@And("^enters password \"([^\"]*)\"$")
	public void enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(string);
	}

	@When("clicked on login")
	public void clicked_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("entered");
	}

	@Then("home page appeared")
	public void home_page_appeared() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("displayed");
	}


}
