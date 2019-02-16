package com.cap.dao;

import com.cap.exception.ProductIdInvalidException;

import co.cap.bean.Product;

public interface IRepo 
{
	public Product getProductDetails(int prodCode) throws ProductIdInvalidException;
	

}
