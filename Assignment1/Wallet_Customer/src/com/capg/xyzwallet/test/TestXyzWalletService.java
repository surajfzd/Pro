package com.capg.xyzwallet.test;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.capg.xyzwallet.bean.WalletBean;
import com.capg.xyzwallet.exception.WalletException;
import com.capg.xyzwallet.service.IWalletService;
import com.capg.xyzwallet.service.WalletServiceImp;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestXyzWalletService {

	private static IWalletService service = null;

	@BeforeClass
	public static void init() {
		service = new WalletServiceImp();
	}
	@Test
	public void testforValidfName()throws WalletException {
	WalletBean walletBean = new WalletBean();
	walletBean.setFirstName("hari");
	walletBean.setLastName("varun");
	walletBean.setPhoneNumber(new BigInteger("6542312423"));
	walletBean.setEmail("mshvarunkumar@gmail.com");
	walletBean.setAddress("address-1");
	assertTrue(service.createAccount(walletBean));

	}
	@Test (expected=WalletException.class)
	public void testforInValidfName()throws WalletException {
	WalletBean walletBean = new WalletBean();
	walletBean.setFirstName("ha");
	walletBean.setLastName("varun");
	walletBean.setPhoneNumber(new BigInteger("6542312423"));
	walletBean.setEmail("mshvarunkumar@gmail.com");
	walletBean.setAddress("address-1");
	assertFalse(service.createAccount(walletBean));
	}
	@Test(expected=WalletException.class)
	public void testforValidLName()throws WalletException {
	WalletBean walletBean = new WalletBean();
	walletBean.setFirstName("hari");
	walletBean.setLastName("varun");
	walletBean.setPhoneNumber(new BigInteger("6542312423"));
	walletBean.setEmail("mshvarunkumar@gmail.com");
	walletBean.setAddress("address-1");
	assertTrue(service.createAccount(walletBean));

	}
	@Test (expected=WalletException.class)
	public void testforInValidlName()throws WalletException
	{WalletBean walletBean = new WalletBean();
	walletBean.setFirstName("hari");
	walletBean.setLastName("va");
	walletBean.setPhoneNumber(new BigInteger("6542312423"));
	walletBean.setEmail("mshvarunkumar@gmail.com");
	walletBean.setAddress("address-1");
	assertFalse(service.createAccount(walletBean));
	}

	@Test (expected=WalletException.class)
	public void testforValidPhoneNumber()throws WalletException
	{WalletBean walletBean = new WalletBean();
	walletBean.setFirstName("hari");
	walletBean.setLastName("varun");
	walletBean.setPhoneNumber(new BigInteger("6542312423"));
	walletBean.setEmail("mshvarunkumar@gmail.com");
	walletBean.setAddress("address-1");
	assertTrue(service.createAccount(walletBean));

	}
	@Test (expected=WalletException.class)
	public void testforInValidphoneNumber()throws WalletException
	{WalletBean walletBean = new WalletBean();
	walletBean.setFirstName("hari");
	walletBean.setLastName("varun");
	walletBean.setPhoneNumber(new BigInteger("944117552"));
	walletBean.setEmail("mshvarunkumar@gmail.com");
	walletBean.setAddress("address-1");
	assertFalse(service.createAccount(walletBean));

	}
	@Test 
	public void testforvalidAddress()throws WalletException
	{WalletBean walletBean = new WalletBean();
	walletBean.setFirstName("hari");
	walletBean.setLastName("varun");
	walletBean.setPhoneNumber(new BigInteger("6542312423"));
	walletBean.setEmail("mshvarunkumar@gmail.com");
	walletBean.setAddress("address-1");
	assertTrue(service.createAccount(walletBean));

	}
	@Test(expected=WalletException.class)
	public void testforInvalidAddress()throws WalletException
	{WalletBean walletBean = new WalletBean();
	walletBean.setFirstName("hari");
	walletBean.setLastName("varun");
	walletBean.setPhoneNumber(new BigInteger("6542312423"));
	walletBean.setEmail("mshvarunkumar@gmail.com");
	walletBean.setAddress(null);
	assertFalse(service.createAccount(walletBean));
	}
	@Test
	public void testforEmail()throws WalletException
	{WalletBean walletBean = new WalletBean();
	walletBean.setFirstName("hari");
	walletBean.setLastName("varun");
	walletBean.setPhoneNumber(new BigInteger("6542312423"));
	walletBean.setEmail("mshvarunkumar@gmail.com");
	walletBean.setAddress(" address-1");
	assertTrue(service.createAccount(walletBean));
	}
	@Test(expected=WalletException.class)
	public void testforInvalidEmail1()throws WalletException {
	WalletBean walletBean = new WalletBean();
	walletBean.setFirstName("hari");
	walletBean.setLastName("varun");
	walletBean.setPhoneNumber(new BigInteger("6542312423"));
	walletBean.setEmail(".com@gmail.com");
	walletBean.setAddress("address-1 ");
	assertFalse(service.createAccount(walletBean));
	}
	@Test(expected=WalletException.class)
	public void testforInvalidEmail2()throws WalletException {
	WalletBean walletBean = new WalletBean();
	walletBean.setFirstName("hari");
	walletBean.setLastName("varun");
	walletBean.setPhoneNumber(new BigInteger("6542312423"));
	walletBean.setEmail("@gmail.com");
	walletBean.setAddress("address-1 ");
	assertFalse(service.createAccount(walletBean));
	}
	@Test
	public void testShowBalance() { 
		double result = service.showBalance();
				System.out.println(result);
		Assert.assertEquals(3600.0, result, 0); 
	
		}

	@Test
	public void TestAfundTransfer() throws WalletException {
		double result = service.fundTransfer(new BigInteger("1234567890"),
				600.0);
		
		System.out.println(result);
		Assert.assertEquals(1400.0, result, 0);
	}
	@Test
	public void TestBWithDraw() throws WalletException {
		double result = service.withDraw(1000.0);
		System.out.println(result);
		Assert.assertEquals(2600.00, result, 0);
	}
	@Test
	public void testCDepositAmountValid() throws WalletException {
		double result = service.deposit(1000.0);
		System.out.println(result);
		Assert.assertEquals(3600.0, result, 0);
	}
	
}
