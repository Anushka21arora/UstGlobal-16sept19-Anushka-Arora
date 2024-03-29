package com.ustglobal.retailerwebapp.repo;

import com.ustglobal.retailerwebapp.dto.Order;
import com.ustglobal.retailerwebapp.dto.Retailer;

public interface RetailerService {
	public boolean createProfile(Retailer bean);
	public Retailer login (int retailerId ,String password );
	public Order searchProduct(int productId);
	public boolean updatePassword(int retailerId,String password);
	public double payableAmount(Order order);
	public Order retrieve(int retailerId);
}
