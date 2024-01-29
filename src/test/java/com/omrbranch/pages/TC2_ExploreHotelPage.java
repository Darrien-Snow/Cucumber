package com.omrbranch.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;
import com.omrbranch.stepdefinition.CommonStep;

public class TC2_ExploreHotelPage extends BaseClass {

	public TC2_ExploreHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[text()='Hotel Booking']")
	private WebElement lnkHotelBooking;

	// @FindBy(xpath = "//a[contains(text(),'Welcome Darrien')]")
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement textProfileName;

	@FindBy(id = "state")
	private WebElement ddnState;

	// @FindBy(xpath ="//span[@id='select2-city-container']")

	@FindBy(id = "city")
	private WebElement ddnCity;

	@FindBy(id = "room_type")
	private WebElement ddnSelectRoom;

	@FindBy(name = "check_in")
	private WebElement txtCheckIn;

	@FindBy(name = "check_out")
	private WebElement txtCheckOut;

	@FindBy(id = "no_rooms")
	private WebElement ddnNoofRoom;

	@FindBy(id = "no_adults")
	private WebElement ddnNoofAdults;

	@FindBy(id = "no_child")
	private WebElement ddnNoofChildren;

	@FindBy(id = "hotelsearch_iframe")
	private WebElement frameHotelSearch;

	@FindBy(xpath = "(//div[@class='invalid-feedback animated fadeInDown'])[1]")
	private WebElement textStateErrorMsg;

	@FindBy(xpath = "(//div[@class='invalid-feedback animated fadeInDown'])[2]")
	private WebElement textCityErrorMsg;

	@FindBy(xpath = "(//div[@class='invalid-feedback animated fadeInDown'])[3]")
	private WebElement textCheckInErrorMsg;

	@FindBy(xpath = "(//div[@class='invalid-feedback animated fadeInDown'])[4]")
	private WebElement textCheckOutErrorMsg;

	@FindBy(xpath = "(//div[@class='invalid-feedback animated fadeInDown'])[5]")
	private WebElement textNoOfRoomErrorMsg;

	@FindBy(xpath = "(//div[@class='invalid-feedback animated fadeInDown'])[6]")
	private WebElement textNoOfAudultsErrorMsg;

	@FindBy(xpath = "//button[@id='searchBtn']")
	private WebElement btnSeach;

	public WebElement getLnkHotelBooking() {
		return lnkHotelBooking;
	}

	public WebElement getTextProfileName() {
		return textProfileName;
	}

	public WebElement getDdnState() {
		return ddnState;
	}

	public WebElement getDdnCity() {
		return ddnCity;
	}

	public WebElement getDdnSelectRoom() {
		return ddnSelectRoom;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getDdnNoofRoom() {
		return ddnNoofRoom;
	}

	public WebElement getDdnNoofAdults() {
		return ddnNoofAdults;
	}

	public WebElement getDdnNoofChildren() {
		return ddnNoofChildren;
	}

	public WebElement getFrameHotelSearch() {
		return frameHotelSearch;
	}

	public WebElement getTextStateErrorMsg() {
		return textStateErrorMsg;
	}

	public WebElement getTextCityErrorMsg() {
		return textCityErrorMsg;
	}

	public WebElement getTextCheckInErrorMsg() {
		return textCheckInErrorMsg;
	}

	public WebElement getTextCheckOutErrorMsg() {
		return textCheckOutErrorMsg;
	}

	public WebElement getTextNoOfRoomErrorMsg() {
		return textNoOfRoomErrorMsg;
	}

	public WebElement getTextNoOfAudultsErrorMsg() {
		return textNoOfAudultsErrorMsg;
	}

	public WebElement getBtnSeach() {
		return btnSeach;
	}
	public void clkSearchbtn() {
		switchFrameByWebElement(getFrameHotelSearch());
		clickJs(getBtnSeach());

	}
	// | state Name | city Name | select Room Type | check in date | check out date
	// | No of Rooms | No of Adults | No of Childers |
	// | Tamil Nadu | Tiruchirappalli | Luxury | 2023-12-19 | 2023-12-29 | 4-Four |
	// 2-Two | 2 |

	public void mantatorySearchFields(String stateName, String cityName, String checkIn, String checkOut,
			String noOfRooms, String noOfAdult) {
		selectOptionByVisibleText(getDdnState(), stateName);
		selectOptionByVisibleText(getDdnCity(), cityName);
		insertValueJs(getTxtCheckIn(), checkIn);
		insertValueJs(getTxtCheckOut(), checkOut);
		selectOptionByVisibleText(getDdnNoofRoom(), noOfRooms);
		selectOptionByVisibleText(getDdnNoofAdults(), noOfAdult);
	}
	
	public String loginSuccessMsg() {
		String text = getText(getTextProfileName());
		return text;

	}

	public void roomType(String roomType) {
		// Room Type for single or Muliple options
		// String roomType="Luxury"; or " Luxury/Standsrd/Studio/Large"
		String[] split = roomType.split("/");
		for (String eachroom : split) {
			selectOptionByVisibleText(getDdnSelectRoom(), eachroom);
		}

	}
	public void clkHotelBooking()
	{
		ClickBtn_element(getLnkHotelBooking());
	}
	

	public void optionalSearchFields(String roomTypeInput, String noOfChildren) {
		roomType(roomTypeInput);
		insertValueJs(getDdnNoofChildren(), noOfChildren);
	}
	
	


	public void enterAllSearchFields(String stateName, String cityName, String checkIn, String checkOut,
			String noOfRooms, String noOfAdult, String roomTypeInput, String noOfChildren) {
		mantatorySearchFields(stateName, cityName, checkIn, checkOut, noOfRooms, noOfAdult);
		optionalSearchFields(roomTypeInput, noOfChildren);
		clkSearchbtn();
	}

	public String getStateErrorMsg() {
		String stateErrorMsg = getText(getTextStateErrorMsg());
		return stateErrorMsg;

	}

	public String getCityErrorMsg() {
		String cityErrorMsg = getText(getTextCityErrorMsg());
		return cityErrorMsg;

	}

	public String getCheckInErrorMsg() {
		String checkInErrorMsg = getText(getTextCheckInErrorMsg());
		return checkInErrorMsg;

	}

	public String getCheckOutErrorMsg() {
		String checkOutErrorMsg = getText(getTextCheckOutErrorMsg());
		return checkOutErrorMsg;

	}

	public String getNoofRoomErrorMsg() {
		String noOfRoomErrorMsg = getText(getTextNoOfRoomErrorMsg());
		return noOfRoomErrorMsg;

	}

	public String getNoofAdultErrorMsg() {
		String noOfAdultErrorMsg = getText(getTextNoOfAudultsErrorMsg());
		return noOfAdultErrorMsg;

	}

	public void sortingPriceLowToHigh() throws InterruptedException {

		List<WebElement> findElements = driver.findElements(By.xpath("//strong[@class='total-prize']"));
		List<String> price = new ArrayList<>();
		for (int i = 0; i < findElements.size(); i++) {
			WebElement webElement = findElements.get(i);
			String text = getText(webElement);
			price.add(text);
		}
		System.out.println("before websorted: " + price);

		WebElement radio = driver.findElement(By.xpath("//label[text()='Price low to high']"));
		ClickBtn_element(radio);

		// implicitWait(50);
		Thread.sleep(1000);
		List<WebElement> findElements1 = driver.findElements(By.xpath("//strong[@class='total-prize']"));
		List<String> price1 = new ArrayList<>();
		for (int i = 0; i < findElements1.size(); i++) {
			WebElement webElement = findElements1.get(i);
			String text = getText(webElement);
			price1.add(text);
		}
		System.out.println("After websorted: " + price1);

		List<String> sorted = new ArrayList<>();
		sorted.addAll(price);
		Collections.sort(sorted);
		System.out.println("Coding sorted: " + sorted);

		if (price1.equals(sorted)) {

			System.out.println("Sorted working fine");

		}
	}

	public void sortingNameDedending() throws InterruptedException {

		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']/h5"));
		List<String> names = new ArrayList<>();
		for (int i = 0; i < findElements.size(); i++) {
			WebElement webElement = findElements.get(i);
			String text = getText(webElement);
			names.add(text);
		}
		System.out.println("before websorted: " + names);

		WebElement radio = driver.findElement(By.xpath("//label[text()='Name Descending']"));
		ClickBtn_element(radio);

		// implicitWait(50);
		Thread.sleep(1000);
		List<WebElement> findElements1 = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']/h5"));
		List<String> names1 = new ArrayList<>();
		for (int i = 0; i < findElements1.size(); i++) {
			WebElement webElement = findElements1.get(i);
			String text = getText(webElement);
			names1.add(text);
		}
		System.out.println("After websorted: " + names1);

		List<String> sorted = new ArrayList<>();
		sorted.addAll(names);
		Collections.reverse(sorted);
		System.out.println("Coding sorted: " + sorted);

		if (names1.equals(sorted)) {

			System.out.println("Sorted working fine");

		} else {
			System.err.println("Sorting Not working correct");
		}

	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		PageObjectManager pom = new PageObjectManager();
		CommonStep commonStep = new CommonStep();
		commonStep.user_is_on_the_omr_branch_login_page();
		pom.getLoginPage().validLogin("dassdowney@gmail.com", "Testing@12");
		pom.getExploreHotelPage().clkHotelBooking();
	
		pom.getExploreHotelPage().clkSearchbtn();
		
	}

}
