package com.capgemini.beans;

public class Address {

	private String name;
	private Country country;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(String name, Country country) {
		super();
		this.name = name;
		this.country = country;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [name=" + name + ", country=" + country + "]";
	}
	
	
	
}