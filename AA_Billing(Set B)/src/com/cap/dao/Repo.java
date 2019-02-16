package com.cap.dao;

import java.util.HashMap;
import java.util.Map;

import com.cap.exception.ProductIdInvalidException;
import com.cap.util.CollectionUtil;

import co.cap.bean.Product;

public class Repo implements IRepo
{
	CollectionUtil util;
	Product product;
	
	Map<Integer, Product> hmap=new HashMap<Integer, Product>();

	@Override
	public Product getProductDetails(int prodCode) throws ProductIdInvalidException 
	{
		product=util.getProducts().get(prodCode);
		if(product==null)
			throw new ProductIdInvalidException();
		return product;
	}

}
