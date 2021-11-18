package com.bridgelabz.hotelreservationsystem;

public class Hotel {

	private String hotelName;
	private String customerType;
	private int rating;
	
	public Hotel(String hotelName, String customerType, int rating) {
		super();
		this.hotelName = hotelName;
		this.customerType = customerType;
		this.rating = rating;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", customerType=" + customerType + ", rating=" + rating + "]";
	}
}
