package com.cap.service;

import java.util.HashMap;

import com.cap.bean.Sale;

public interface ISaleService 
{
	public HashMap<Integer, Sale> insertSaleDetails(Sale sale);
	public boolean validateProductCode(int productId);
	public boolean validateQuantity(int qty);
	public boolean validateProdCat(String prodCat);
	public boolean validateProdName(String prodName, int flag);
	public boolean validateProductPrice(float price);
	

}
