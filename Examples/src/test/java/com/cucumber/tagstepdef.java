package com.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tagstepdef {
	@Given("user enters {string} as input")
	public void user_enters_as_input(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("username");
	}

	@And("enters password as {string} in the field")
	public void enters_password_as_in_the_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("password123");
	}

	@When("he clicks on login button")
	public void he_clicks_on_login_button() {
	    /// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("logged in");
	}

	@Then("home page is appeared")
	public void home_page_is_appeared() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("displayed");
	}


	
	@Given("user enters new password")
	public void user_enters_new_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user enters new password : asdf@123");
	}

	@And("user re enters new password")
	public void user_re_enters_new_password() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("user re enters new password : asdf@123");
	}

	@When("he confirms the password entered")
	public void he_confirms_the_password_entered() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("password is confirmed");
	}

	@Then("updated password")
	public void updated_password() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("assword is updated");
	}
}
