package com.ustglobal.retailerwebapp.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.retailerwebapp.dao.RetailerDao;
import com.ustglobal.retailerwebapp.dto.Order;
import com.ustglobal.retailerwebapp.dto.Retailer;
@Service
public class RetailerServiceImpl implements RetailerService{
@Autowired
private RetailerDao dao;

	@Override
	public boolean createProfile(Retailer bean) {
		
		return dao.createProfile(bean);
	}

	@Override
	public Retailer login(int retailerId, String password) {
		
		return dao.login(retailerId, password);
	}

	@Override
	public Order searchProduct(int productId) {
		
		return dao.searchProduct(productId);
	}

	@Override
	public boolean updatePassword(int retailerId, String password) {
	
		return dao.updatePassword(retailerId, password);
	}

	@Override
	public double payableAmount(Order order) {
		
		return dao.payableAmount(order);
	}

	@Override
	public Order retrieve(int retailerId) {
		
		return dao.retrieve(retailerId);
	}

}
