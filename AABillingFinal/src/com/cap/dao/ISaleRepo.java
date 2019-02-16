package com.cap.dao;

import java.util.HashMap;

import com.cap.bean.Sale;

public interface ISaleRepo 
{
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale);

}
