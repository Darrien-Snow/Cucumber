package com.omrbranch.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_ExploreHotelStep {
	PageObjectManager pom = new PageObjectManager();

	@When("User enters searching details {string}, {string}, {string}, {string},{string},{string}, {string}, {string}")
	public void user_enters_searching_details(String stateName, String cityName, String roomType, String checkIndate,
			String checkOutdate, String NoofRooms, String NoofAdults, String NoofChildern) {
		pom.getExploreHotelPage().clkHotelBooking();
		pom.getExploreHotelPage().enterAllSearchFields(stateName, cityName, checkIndate, checkOutdate, NoofRooms,
				NoofAdults, roomType, NoofChildern);
	}

	@Then("User verifies search result {string}")
	public void user_verifies_search_result(String expectedSelectedHotelMsg) {
		String actualSelectHotelMsg = pom.getSelectHotelPage().getSelectHotelMsg();
		Assert.assertEquals("Verify Select hotel Success msg", expectedSelectedHotelMsg, actualSelectHotelMsg);
	}

	@When("User enters searching details {string}, {string}, {string},{string},{string}, {string}")
	public void user_enters_searching_details(String stateName, String cityName, String checkIndate,
			String checkOutdate, String NoofRooms, String NoofAdults) {
		pom.getExploreHotelPage().clkHotelBooking();
		pom.getExploreHotelPage().mantatorySearchFields(stateName, cityName, checkIndate, checkOutdate, NoofRooms,
				NoofAdults);
		pom.getExploreHotelPage().clkSearchbtn();
	}

	@When("User clicks search button")
	public void user_clicks_search_button() {
		pom.getExploreHotelPage().clkHotelBooking();
		pom.getExploreHotelPage().clkSearchbtn();
	}

	@Then("User verifies error message {string},  {string},{string},{string},{string},{string},")
	public void user_verifies_error_message(String expStateErrorMsg, String expCityErrorMsg, String expCheckInerror,
			String expCheckOuterror, String expNoofRoomErrorMsg, String expNoofAudultErrorMsg) {

		String actualStateErrorMsg = pom.getExploreHotelPage().getStateErrorMsg();
		Assert.assertEquals("Verify State ErrorMsg", expStateErrorMsg, actualStateErrorMsg);

		String actualCityErrorMsg = pom.getExploreHotelPage().getCityErrorMsg();
		Assert.assertEquals("Verify City ErrorMsg", expCityErrorMsg, actualCityErrorMsg);

		String actualCheckInErrorMsg = pom.getExploreHotelPage().getCheckInErrorMsg();
		Assert.assertEquals("Verify statErrorMsg", expCheckInerror, actualCheckInErrorMsg);

		String actualCheckOutErrorMsg = pom.getExploreHotelPage().getCheckOutErrorMsg();
		Assert.assertEquals("Verify statErrorMsg", expCheckOuterror, actualCheckOutErrorMsg);

		String actualNoofRoomErrorMsg = pom.getExploreHotelPage().getNoofRoomErrorMsg();
		Assert.assertEquals("Verify statErrorMsg", expNoofRoomErrorMsg, actualNoofRoomErrorMsg);

		String actualNoofAdultErrorMsg = pom.getExploreHotelPage().getNoofAdultErrorMsg();
		Assert.assertEquals("Verify statErrorMsg", expNoofAudultErrorMsg, actualNoofAdultErrorMsg);
	}

	@Then("User verifies {string}")
	public void user_verifies(String expSelectedRoomType) {
		String actualSelectedRoomType = pom.getSelectHotelPage().getRoomType();
		Assert.assertEquals("Verify selected Room Type", expSelectedRoomType, actualSelectedRoomType);
	}

}
