package com.ddt.practise;


import java.util.List;
import java.util.Map;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class gmailstepdef {
	@Given("I want to enter gmail url")
	public void i_want_to_enter_gmail_url() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("gmail url is entered");
	}

	@And("I enter valid username and password")
	public void i_enter_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		for(int i=0;i<list.size();i++)
		{
			System.out.println("gmail username : "+list.get(i).get("username"));
			System.out.println("gmail password : "+list.get(i).get("password"));
		}
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
	}

	@When("I click on sigin button")
	public void i_click_on_sigin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("clicked on signin button");
	}

	@Then("gmail home page is displayed")
	public void gmail_home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("gmail home page is displayed");
	}


}
