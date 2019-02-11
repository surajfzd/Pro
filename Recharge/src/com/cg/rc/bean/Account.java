package com.cg.rc.bean;

public class Account {
	private int id;
	private double balance;
	private String name;
	
	
	
	public Account(int id, double balance, String name) {
		super();
		this.id = id;
		this.balance = balance;
		this.name = name;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", name=" + name + "]";
	}
	


}
