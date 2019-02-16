package com.cap.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cap.dao.ISaleRepo;
import com.cap.dao.SaleRepo;
import com.cap.service.ISaleService;
import com.cap.service.SaleService;

public class SaleServiceTest {
	
	ISaleRepo salerepo=new SaleRepo();
	ISaleService saleservice=new SaleService(salerepo);

	

	@Test
	public void whenInvalidCodeIsEnteredSystemShouldReturnFalse()
	{
		assertEquals(false, saleservice.validateProductCode(100));
	
	}
	
	@Test
	public void whenValidCodeIsEnteredReturnTrue()
	{
		assertEquals(true, saleservice.validateProductCode(1001));
	}

}
