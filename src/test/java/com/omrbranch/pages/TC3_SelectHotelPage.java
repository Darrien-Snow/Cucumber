package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class TC3_SelectHotelPage extends BaseClass {

	public static String firstHotelName;
	public static String firstHotelPrice;

	public TC3_SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Select Hotel']")
	private WebElement textSelectHotel;

	@FindBy(xpath = "(//h5)[2]")
	private WebElement textFirstSearchResult;

	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private WebElement textFirstSearchResult_TotalPrice;

	@FindBy(xpath = "(//a[text()='Continue'])[1]")
	private WebElement btnFirstSearchResult_Continue;

	@FindBy(xpath = "//a[@id='room_type']")
	private WebElement textRoomType;

	public WebElement getTextSelectHotel() {
		return textSelectHotel;
	}

	public WebElement getTextFirstSearchResult() {
		return textFirstSearchResult;
	}

	public WebElement getTextFirstSearchResult_TotalPrice() {
		return textFirstSearchResult_TotalPrice;
	}

	public WebElement getBtnFirstSearchResult_Continue() {
		return btnFirstSearchResult_Continue;
	}

	public WebElement getTextRoomType() {
		return textRoomType;
	}

	public String getSelectHotelMsg() {
		String successMsg_SelectHotel = getText(getTextSelectHotel());
		return successMsg_SelectHotel;

	}

	public String getRoomType() {
		String roomType = getText(getTextRoomType());
		return roomType;

	}

	public String getFirstHotelName() {
		firstHotelName = getText(getTextFirstSearchResult());
		return firstHotelName;

	}

	public String getFirstHotelprice() {
		firstHotelPrice = getText(getTextFirstSearchResult_TotalPrice());
		return firstHotelPrice;

	}

	public void clickFirstHotelFromResult() {
		ClickBtn_element(getBtnFirstSearchResult_Continue());

	}

	public void acceptAlert() {
		okAlert();
	}

	public void dismissAlert() {
		cancelAlert();

	}

	public void verifyPriceLowToHigh() {

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

		// Thread.sleep(5000);
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

	public void verifySorting() {

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

		// Thread.sleep(5000);
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

}
