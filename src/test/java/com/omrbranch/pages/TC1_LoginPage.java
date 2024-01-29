package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class TC1_LoginPage extends BaseClass {

	public TC1_LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtUserName;

	@FindBy(id = "pass")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[@value='login']")
	private WebElement btnLogin;

	@FindBy(id = "errorMessage")
	private WebElement textInvalidErrorMsg;

	public WebElement getTextInvalidErrorMsg() {
		return textInvalidErrorMsg;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public void validLogin(String email, String password) {
		elementSendKeys(getTxtUserName(), email);
		elementSendKeys(getTxtPassword(), password);
		ClickBtn_element(getBtnLogin());

	}

	public void validLoginWithEnterKey(String email, String password) {
		elementSendKeys(getTxtUserName(), email);
		elementSendKeysEnter(getTxtPassword(), password);
	}

	public String loginErrorMsg() {
		String loginErrorMsg = getText(getTextInvalidErrorMsg());
		return loginErrorMsg;

	}

}
