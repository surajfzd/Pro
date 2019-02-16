package com.cap.service;

import com.cap.dao.IRepo;
import com.cap.dao.Repo;
//import com.cap.exception.ProductIdInvalidException;
import com.cap.exception.ProductIdInvalidException;

import co.cap.bean.Product;

public class Service implements IService
{
	
	IRepo repo;

	

	public Service(IRepo repo) {
		super();
		this.repo=repo;
		// TODO Auto-generated constructor stub
	}




	@Override
	public Product getProductDetails(int productCode) throws ProductIdInvalidException
	{
		
		return repo.getProductDetails(productCode);
	}

}
