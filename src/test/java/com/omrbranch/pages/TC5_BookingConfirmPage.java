package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class TC5_BookingConfirmPage extends BaseClass {
	// Order id Instance variable - to reuse
	public static String orderId;

	public TC5_BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//strong)[1]")
	private WebElement textOrderIdOnly;

	// @FindBy(xpath = "(//h2)[1]")
	// private WebElement text_BookingConfirmed;

	@FindBy(name = "booking-code")
	private WebElement text_BookingConfirmed;

	@FindBy(xpath = "(//strong)[2]")
	private WebElement textBookedHotelName;

	@FindBy(xpath = "//button[text()='Go To Home']")
	private WebElement btnGotoHome;

	public WebElement getTextOrderIdOnly() {
		return textOrderIdOnly;
	}

	public WebElement getText_BookingConfirmed() {
		return text_BookingConfirmed;
	}

	public WebElement getTextBookedHotelName() {
		return textBookedHotelName;
	}

	public WebElement getBtnGotoHome() {
		return btnGotoHome;
	}

	public String verifyBookingConfirmMsg() {
		String text_BookingConfirmed = getText(getText_BookingConfirmed());
		return text_BookingConfirmed;

	}

	public String verifyBookedOrderId() {
		String text_OrderIdOnly = getText(getTextOrderIdOnly());
		return text_OrderIdOnly;

	}

	public String verifyBookedHotelName() {
		String text_BookedHotelName = getText(getTextBookedHotelName());
		return text_BookedHotelName;

	}
	
	public void clickGoToHome() {
		ClickBtn_element(getBtnGotoHome());

	}

}
