package com.cap.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cap.dao.IRepo;
import com.cap.dao.Repo;
import com.cap.exception.ProductIdInvalidException;
import com.cap.service.IService;
import com.cap.service.Service;

public class ServiceTest {
	IRepo repo=new Repo();
	IService serv=new Service(repo);

	
	@Test(expected=com.cap.exception.ProductIdInvalidException.class)
	public void whenInvalidIdIsGivenSystemShouldThrowException() throws ProductIdInvalidException 
	{
//		assertEquals(1001, serv.getProductDetails());
		serv.getProductDetails(2222);
	}
	
	@Test
	public void whenValidIdIsGivenSystemShouldNotThrowException() throws ProductIdInvalidException 
	{
//		assertEquals(1001, serv.getProductDetails());
		serv.getProductDetails(1001);
	}

}
