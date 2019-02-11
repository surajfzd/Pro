package com.cg.dao;

import java.util.List;
import java.util.Map;

import com.cg.bean.Mobile;
import com.cg.bean.PurchaseDetails;
import com.cg.exception.MobilePurchaseException;

public interface MobilePurchaseDao {
	 public Map<Integer,PurchaseDetails> insertDetails(int mobileid);
	    public List<Mobile> updateMobilesList(int mobileid) throws MobilePurchaseException;
	    public List<Mobile> displayMobilesList() throws MobilePurchaseException;
	    public List<Mobile> deleteMobile(int mobileid);
	    public List<Mobile> searchMobilesList(int lowRange,int highRange) throws MobilePurchaseException;

}
