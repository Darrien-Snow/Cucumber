package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.omrbranch.base.BaseClass;

public class TC6_MyBookingPage extends BaseClass {
	public TC6_MyBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement txtProfileName;

	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement lstMyAccount;

	// Edit Booking
	@FindBy(xpath = "//h4")
	private WebElement textBooking;

	@FindBy(name = "search")
	private WebElement txtSearchBooking;

	@FindBy(xpath = "(//span)[7]")
	private WebElement textOrderId;

	@FindBy(xpath = "(//h5)")
	private WebElement textBookedHotelName;

	@FindBy(xpath = "//strong")
	private WebElement textTotalPrice;

	@FindBy(xpath = "//button[text()='Edit']")
	private WebElement btnEditBooking;

	@FindBy(name = "check_in")
	private WebElement txtCheckIn;

	@FindBy(name = "check_out")
	private WebElement txtCheckOut;

	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement btnConfirm;

	@FindBy(xpath = "(//li)[15]")
	private WebElement textBookingUpdatedMsg;

	// Find elelment for Cancel booking

	@FindBy(xpath = "//a[text()='Cancel']")
	private WebElement btnCancelBooking;

	public WebElement getTxtProfileName() {
		return txtProfileName;
	}

	public WebElement getLstMyAccount() {
		return lstMyAccount;
	}

	public WebElement getTextBooking() {
		return textBooking;
	}

	public WebElement getTxtSearchBooking() {
		return txtSearchBooking;
	}

	public WebElement getTextOrderId() {
		return textOrderId;
	}

	public WebElement getTextBookedHotelName() {
		return textBookedHotelName;
	}

	public WebElement getTextTotalPrice() {
		return textTotalPrice;
	}

	// edit booking
	public WebElement getBtnEditBooking() {
		return btnEditBooking;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public WebElement getTextBookingUpdatedMsg() {
		return textBookingUpdatedMsg;
	}

	// Find elelment for Cancel booking

	public WebElement getBtnCancelBooking() {
		return btnCancelBooking;
	}

	public void clickMyBooking() {
		clickJs(getTxtProfileName());
		ClickBtn_element(getLstMyAccount());

	}

	public String verifyMyBookingPage() {

		String textBooking = getText(getTextBooking());
		return textBooking;
	}

	public void searchOrderId() {
		String orderId = TC5_BookingConfirmPage.orderId;
		String newOrderId = orderId.substring(1, orderId.length() - 1);

		elementSendKeysEnter(getTxtSearchBooking(), newOrderId);

	}

	public String verifyResultOderId() {
		String textBookingOrderId = getText(getTextOrderId());
		return textBookingOrderId;

		// Assert.assertEquals(textBookingOrderId, BookingConfirmPage.orderId, "Verify
		// Order Id-MyBooking");

	}

	public String verifyResultHotelName() {
		String textBookedHotelName = getText(getTextBookedHotelName());
		return textBookedHotelName;
		// Assert.assertEquals(textBookedHotelName, BookHotelPage.SelectedHotel_Name,
		// "Verify Hotel Name-My Booking");
	}

	public String verifyResultHotelPrice() {
		String textTotalPrice = getText(getTextTotalPrice());
		return textTotalPrice;

	}

	public void clickEdit() {
		ClickBtn_element(getBtnEditBooking());

	}

	public void changeCheckInDate_Confirm() {
		insertValueJs(getTxtCheckIn(), "2024-01-15");
		insertValueJs(getTxtCheckOut(), "2024-01-19");
		ClickBtn_element(getBtnConfirm());

	}

	public String ConfirmBookingUpdatedMsg() {
		String textBookingUpdatedMsg = getText(getTextBookingUpdatedMsg());
		return textBookingUpdatedMsg;
		// Assert.assertEquals(textBookingUpdatedMsg, "Booking updated successfully",
		// "Verify Booking Updated msg");

	}

	public void clickCancel() {
		ClickBtn_element(getBtnCancelBooking());
		okAlert();

	}

	public void ExampleSearch(String exampleOrderId) {
		elementSendKeysEnter(getTxtSearchBooking(), exampleOrderId);

	}

	public String CancelBookingdMsg() {
		String textBookingUpdatedMsg = getText(getTextBookingUpdatedMsg());
		return textBookingUpdatedMsg;
		// Assert.assertEquals(textBookingUpdatedMsg, "Booking updated successfully",
		// "Verify Booking Updated msg");

	}

}
