package com.omrbranch.pagemanager;

import com.omrbranch.pages.TC4_BookHotelPage;
import com.omrbranch.pages.TC5_BookingConfirmPage;
import com.omrbranch.pages.TC2_ExploreHotelPage;
import com.omrbranch.pages.TC1_LoginPage;
import com.omrbranch.pages.TC6_MyBookingPage;
import com.omrbranch.pages.TC3_SelectHotelPage;

public class PageObjectManager {

	private TC1_LoginPage loginPage;
	private TC2_ExploreHotelPage exploreHotelPage;
	private TC3_SelectHotelPage selectHotelPage;
	private TC4_BookHotelPage bookHotelPage;
	private TC5_BookingConfirmPage bookingConfirmPage;
	private TC6_MyBookingPage myBookingPage;

	public TC1_LoginPage getLoginPage() {
		return (loginPage==null)?loginPage=new TC1_LoginPage():loginPage;
	}

	public TC2_ExploreHotelPage getExploreHotelPage() {
		return (exploreHotelPage==null)?exploreHotelPage=new TC2_ExploreHotelPage():exploreHotelPage;
	}

	public TC3_SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)?selectHotelPage=new TC3_SelectHotelPage():selectHotelPage;
	}

	public TC4_BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)?bookHotelPage=new TC4_BookHotelPage():bookHotelPage;
	}

	public TC5_BookingConfirmPage getBookingConfirmPage() {
		return (bookingConfirmPage==null)?bookingConfirmPage=new TC5_BookingConfirmPage():bookingConfirmPage;
	}

	public TC6_MyBookingPage getMyBookingPage() {
		return (myBookingPage==null)?myBookingPage=new TC6_MyBookingPage():myBookingPage;
	}

}
