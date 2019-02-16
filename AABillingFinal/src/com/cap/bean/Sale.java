package com.cap.bean;

import java.time.LocalDate;

public class Sale 
{
	private int saleId;
	private int prodCode;
	private String prodName;
	private String catrgory;
	private LocalDate saleDate;
	private int quantity;
	private float lineTotal;
	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getCatrgory() {
		return catrgory;
	}
	public void setCatrgory(String catrgory) {
		this.catrgory = catrgory;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}
	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", prodCode=" + prodCode + ", prodName=" + prodName + ", catrgory=" + catrgory
				+ ", saleDate=" + saleDate + ", quantity=" + quantity + ", lineTotal=" + lineTotal + "]";
	}
	
	

}
