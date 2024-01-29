package com.omrbranch.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class TC4_BookHotelPage extends BaseClass {
	// Hotel name as instance variable
	public static String SelectedHotel_Name;

	public TC4_BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//h2)[1]")
	private WebElement textBookHotel;

	@FindBy(xpath = "(//h5)[1]")
	private WebElement textSelectedHotel_Name;

	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private WebElement textSelectedHotel_Totalprice;

	// User Informations

	@FindBy(id = "own")
	private WebElement rdoSelectUserType;

	@FindBy(id = "user_title")
	private WebElement ddnUserSalutation;

	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@FindBy(id = "user_phone")
	private WebElement txtMobileNo;

	@FindBy(id = "user_email")
	private WebElement txtEmailID;

	// GST

	@FindBy(id = "gst")
	private WebElement chkGST;

	@FindBy(id = "gst_registration")
	private WebElement txtGSTMobileNo;

	@FindBy(id = "company_name")
	private WebElement txtGSTCompanyName;

	@FindBy(id = "company_address")
	private WebElement txtGSTCompanyAddress;

	@FindBy(id = "step1next")
	private WebElement btnNext;

	// Special Requests

	@FindBy(id = "bed")
	private WebElement chkLargeBed;

	@FindBy(id = "other_request")
	private WebElement txtOtherRequest;

	@FindBy(id = "step2next")
	private WebElement btnNext_SpecialRequest;

	// Payment Options

	// @FindBy(className = "credit-card pm")
	@FindBy(xpath = "//h5[text()='Credit/Debit/ATM Card']")
	private WebElement btnCards;

	@FindBy(id = "payment_type")
	private WebElement ddnPaymentType;

	@FindBy(id = "card_type")
	private WebElement ddnCardType;

	// debit-- visa -- 5555555555552222
	@FindBy(id = "card_no")
	private WebElement txtCardNo;

	@FindBy(id = "card_name")
	private WebElement txtCardUserName;

	@FindBy(id = "card_month")
	private WebElement ddnCardMonth;

	@FindBy(id = "card_year")
	private WebElement ddnCardYear;

	@FindBy(id = "cvv")
	private WebElement txtCVV;

	@FindBy(id = "submitBtn")
	private WebElement btnSubmit;

	// Payment Error Message

	@FindBy(id = "invalid-payment_type")
	private WebElement errorTextPaymentType;

	@FindBy(id = "invalid-card_type")
	private WebElement errorTextCardType;

	@FindBy(id = "invalid-card_no")
	private WebElement errorTextCardNo;

	@FindBy(id = "invalid-card_name")
	private WebElement errorTextCardHolderName;

	@FindBy(id = "invalid-card_month")
	private WebElement errorTextCardMonth;

	@FindBy(id = "invalid-cvv")
	private WebElement errorTextCVV;

	public static String getSelectedHotel_Name() {
		return SelectedHotel_Name;
	}

	public WebElement getTextBookHotel() {
		return textBookHotel;
	}

	public WebElement getTextSelectedHotel_Name() {
		return textSelectedHotel_Name;
	}

	public WebElement getTextSelectedHotel_Totalprice() {
		return textSelectedHotel_Totalprice;
	}

	public WebElement getRdoSelectUserType() {
		return rdoSelectUserType;
	}

	public WebElement getDdnUserSalutation() {
		return ddnUserSalutation;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtMobileNo() {
		return txtMobileNo;
	}

	public WebElement getTxtEmailID() {
		return txtEmailID;
	}

	public WebElement getChkGST() {
		return chkGST;
	}

	public WebElement getTxtGSTMobileNo() {
		return txtGSTMobileNo;
	}

	public WebElement getTxtGSTCompanyName() {
		return txtGSTCompanyName;
	}

	public WebElement getTxtGSTCompanyAddress() {
		return txtGSTCompanyAddress;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}

	public WebElement getChkLargeBed() {
		return chkLargeBed;
	}

	public WebElement getTxtOtherRequest() {
		return txtOtherRequest;
	}

	public WebElement getBtnNext_SpecialRequest() {
		return btnNext_SpecialRequest;
	}

	public WebElement getBtnCards() {
		return btnCards;
	}

	public WebElement getDdnPaymentType() {
		return ddnPaymentType;
	}

	public WebElement getDdnCardType() {
		return ddnCardType;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getTxtCardUserName() {
		return txtCardUserName;
	}

	public WebElement getDdnCardMonth() {
		return ddnCardMonth;
	}

	public WebElement getDdnCardYear() {
		return ddnCardYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getErrorTextPaymentType() {
		return errorTextPaymentType;
	}

	public WebElement getErrorTextCardType() {
		return errorTextCardType;
	}

	public WebElement getErrorTextCardNo() {
		return errorTextCardNo;
	}

	public WebElement getErrorTextCardHolderName() {
		return errorTextCardHolderName;
	}

	public WebElement getErrorTextCardMonth() {
		return errorTextCardMonth;
	}

	public WebElement getErrorTextCVV() {
		return errorTextCVV;
	}

	// Mr. ; Darrien ; Snow; 9751080759;dassdowney@gmail.com ; 9043592058 ; Greens
	// Tech OMR Branch ; Thoraipakkam

	public String verifyBookHotel() throws FileNotFoundException, IOException {
		String expectedVerify_BookHotel = getText(getTextBookHotel());
		return expectedVerify_BookHotel;
	}

	public String VerifySeletedHotelName() {
		String selectedHotelName = getText(getTextSelectedHotel_Name());
		return selectedHotelName;

	}

	public String verifySelectedHotelPrice() {
		String selectedHotelTotalPrice = getText(getTextSelectedHotel_Totalprice());
		return selectedHotelTotalPrice;

	}

	public void EnteringGuestDetails(String userSalutation, String FName, String LName, String MobileNo,
			String EmailId) {
		ClickBtn_element(getRdoSelectUserType());
		selectOptionByVisibleText(getDdnUserSalutation(), userSalutation);
		elementSendKeys(getTxtFirstName(), FName);
		elementSendKeys(getTxtLastName(), LName);
		elementSendKeys(getTxtMobileNo(), MobileNo);
		elementSendKeys(getTxtEmailID(), EmailId);
	}

	public void EntringGSTdetails(String GSTMobileNo, String GSTCompanyName, String GSTCompanyAddress) {
		ClickBtn_element(getChkGST());
		elementSendKeys(getTxtGSTMobileNo(), GSTMobileNo);
		elementSendKeys(getTxtGSTCompanyName(), GSTCompanyName);
		elementSendKeys(getTxtGSTCompanyAddress(), GSTCompanyAddress);
		ClickBtn_element(getBtnNext());

	}

	// "2 Large separate beds"
	public void specialRequest(String otherRequestComment) {
		ClickBtn_element(getChkLargeBed());
		elementSendKeys(getTxtOtherRequest(), otherRequestComment);
		ClickBtn_element(getBtnNext_SpecialRequest());

	}

	public void paymentDetails(String paymentType, String cardType, String CardNo, String CardHolderName,
			String CardMonth, String CardYear, String CVV) {
		ClickBtn_element(getBtnCards());
		selectOptionByVisibleText(getDdnPaymentType(), paymentType);
		selectOptionByVisibleText(getDdnCardType(), cardType);
		elementSendKeys(getTxtCardNo(), CardNo);
		elementSendKeys(getTxtCardUserName(), CardHolderName);
		selectOptionByVisibleText(getDdnCardMonth(), CardMonth);
		selectOptionByVisibleText(getDdnCardYear(), CardYear);
		elementSendKeys(getTxtCVV(), CVV);
		ClickBtn_element(getBtnSubmit());
	}

	public String errorMsg_PaymentType() {
		String errorMsgPaymentType = getText(getErrorTextPaymentType());
		return errorMsgPaymentType;

	}

	public String ErrorMsg_CardType() {
		String errorMsgCardType = getText(getErrorTextCardType());
		return errorMsgCardType;

	}

	public String ErrorMessage_CardNo() {
		String errorMsgCardNo = getText(getErrorTextCardNo());
		return errorMsgCardNo;

	}

	public String ErrorMsg_CardHolderName() {
		String errorMsgcardHolderName = getText(getErrorTextCardHolderName());
		return errorMsgcardHolderName;

	}

	public String ErrorMsg_CardMonth() {
		String errorMsgcardMonth = getText(getErrorTextCardMonth());
		return errorMsgcardMonth;

	}

	public String ErrorMsg_CVV() {
		String errorMsgCVV = getText(getErrorTextCVV());
		return errorMsgCVV;

	}
}
