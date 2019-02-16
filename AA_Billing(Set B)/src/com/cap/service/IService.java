package com.cap.service;

import com.cap.exception.ProductIdInvalidException;

import co.cap.bean.Product;

public interface IService 
{
	Product getProductDetails(int productCode) throws ProductIdInvalidException;

}
