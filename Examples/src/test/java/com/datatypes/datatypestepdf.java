package com.datatypes;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class datatypestepdf {
	@Given("user enter {int} in the field")
	public void user_enter_in_the_field(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		int1=123;
		System.out.println("int = "+int1);
	}

	@And("user enters the {double} in the field")
	public void user_enters_the_in_the_field(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		double1=123.123;
		System.out.println("double = "+double1);
	}

	@And("user enters {string}")
	public void user_enters(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		string = "aea 12#$@sde";
		System.out.println("string = "+string);
	}

	@And("usesr enters {string}")
	public void usesr_enters(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		string = " ";
		System.out.println("string = "+string);
	}

}
