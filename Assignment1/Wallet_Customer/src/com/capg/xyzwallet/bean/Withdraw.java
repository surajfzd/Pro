package com.capg.xyzwallet.bean;


import java.time.LocalDateTime;

public class Withdraw {
	
	private LocalDateTime date;
	private double balance;
	private double amount;

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Withdraw [date=" + date + ", balance=" + balance + ", amount=" + amount + "]";
	}
}
