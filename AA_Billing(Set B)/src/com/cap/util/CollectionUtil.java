package com.cap.util;

import java.util.HashMap;
import java.util.Map;

import co.cap.bean.Product;

public class CollectionUtil 
{
	private static Map<Integer, Product> products=new HashMap<Integer, Product>();
	static
	{
		getProducts().put(1001, new Product(1001, "Electronics", "iPhone", 35000));
		getProducts().put(1002, new Product(1002, "Electronics", "TV", 45000));
		
	}
	public static Map<Integer, Product> getProducts() {
		return products;
	}
	public static void setProducts(Map<Integer, Product> products) {
		CollectionUtil.products = products;
	}
	
	
}
