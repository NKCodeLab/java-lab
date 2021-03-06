package com.citibank.model;

public class Address {

	private String house;
	private String building;
	private String street;
	private String city;
	private String state;
	private int pincode;
	private String country;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(String house, String building, String street, String city, String state, int pincode,
			String country) {
		super();
		this.house = house;
		this.building = building;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [house=" + house + ", building=" + building + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + ", country=" + country + "]";
	}
	
	
	
}
