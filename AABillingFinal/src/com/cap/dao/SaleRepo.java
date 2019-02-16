package com.cap.dao;

import java.util.HashMap;

import com.cap.bean.Sale;

public class SaleRepo implements ISaleRepo
{
	HashMap<Integer, Sale> hmm=new HashMap<Integer, Sale>();

	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) 
	{
		//System.out.println("Repo: "+sale);
		hmm.put(sale.getSaleId(), sale);
		return hmm;
	}

}
