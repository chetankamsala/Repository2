package com.ddt;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class instastepdef {
	@Given("I want to enter insta url")
	public void i_want_to_enter_insta_url() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("I want to enter username and password")
	public void i_want_to_enter_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Username : "+list.get(i).get("username"));
			System.out.println("Password : "+list.get(i).get("password"));
		}
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   // throw new cucumber.api.PendingException();
	}

	@When("I click on login")
	public void i_click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user clicked on login button");
	}

	@Then("Home page is appeared")
	public void home_page_is_appeared() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Home page is appeared");
	}


}
