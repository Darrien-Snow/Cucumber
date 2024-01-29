package com.omrbranch.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookingHotelStep {

	@When("User enters all searching details {string}, {string}, {string}, {string},{string},{string}, {string}, {string}")
	public void user_enters_all_searching_details(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User verifies {string},{string}")
	public void user_verifies(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters guest details {string},{string},{string},{string},{string},{string} and GST details {string}, {string},{string}")
	public void user_enters_guest_details_and_gst_details(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8, String string9) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User select {string} and {string}")
	public void user_select_and(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters Payment details {string},{string},{string}, {string}, {string}, {string}, {string}, {string}")
	public void user_enters_payment_details(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8, io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		throw new io.cucumber.java.PendingException();
	}

	@Then("User verifies success message {string}, {string} and saves {string},")
	public void user_verifies_success_message_and_saves(String string, String string2, String string3) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters guest details {string},{string},{string},{string},{string},{string}")
	public void user_enters_guest_details(String string, String string2, String string3, String string4, String string5,
			String string6) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User verifies {string},{string} and book hotel without entering anything")
	public void user_verifies_and_book_hotel_without_entering_anything(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User Verifies error meaage in guest information field {string},{string},{string},{string}, {string},{string}")
	public void user_verifies_error_meaage_in_guest_information_field(String string, String string2, String string3,
			String string4, String string5, String string6) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
