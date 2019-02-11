package com.capgemini.beans;

public class Customer 
{
	private String mobileno;
	private String name;
	private Wallet wallet;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String mobileno, Wallet wallet) {
		super();
		this.mobileno = mobileno;
		this.name = name;
		this.wallet = wallet;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	@Override
	public String toString() 
	{
		return "Customer[Name: "+name+" MobileNo: "+mobileno+" Wallet: "+wallet+"]";
		
	}

}
