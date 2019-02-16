package com.cap.service;

import java.util.HashMap;

import com.cap.bean.Sale;
import com.cap.dao.ISaleRepo;
import com.cap.dao.SaleRepo;

public class SaleService implements ISaleService
{
	ISaleRepo isale=new SaleRepo();

	public SaleService() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public SaleService(ISaleRepo isale) {
		super();
		this.isale = isale;
	}
	
	
	HashMap<Integer, Sale> hm=new HashMap<Integer, Sale>();

	@Override
	public HashMap<Integer, Sale> insertSaleDetails(Sale sale) 
	{
		System.out.println("Service: "+sale);
		hm=isale.insertSalesDetails(sale);
		System.out.println(hm);	
		return hm;
	}
	
	

	@Override
	public boolean validateProductCode(int productId) 
	{
		if(productId==1001||productId==1002||productId==1003||productId==1004)
			return true;
		return false;
	}

	@Override
	public boolean validateQuantity(int qty) 
	{
		if(qty>0&&qty<5)
			return true;
		return false;
	}

	@Override
	public boolean validateProdCat(String prodCat)
	{
		if(prodCat.equals("Electronics")||prodCat.equals("Toys"))
			return true;
		return false;
	}

	@Override
	public boolean validateProdName(String prodName, int flag) 
	{
		if((flag==0 && prodName.equals("Smart Phone")||prodName.equals("TV")||prodName.equals("Video Game"))||prodName.equals("Soft Toy")||prodName.equals("Telescope")||prodName.equals("Barbee Doll"))
			return true;
		return false;
	}

	@Override
	public boolean validateProductPrice(float price) 
	{
		if(price>200)
			return true;
		return false;
	}

}
