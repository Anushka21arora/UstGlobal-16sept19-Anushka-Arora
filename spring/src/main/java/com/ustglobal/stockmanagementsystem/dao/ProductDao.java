package com.ustglobal.stockmanagementsystem.dao;

import java.util.List;

import com.ustglobal.stockmanagementsystem.dto.ProductInfo;

public interface ProductDao {
	public ProductInfo searchByName(String name);

	public List<ProductInfo> searchByCatergory(String category);

	public List<ProductInfo> searchByCompany(String company);

	public boolean addProduct(ProductInfo bean);

	public boolean updateProduct(ProductInfo bean);
	
	public List<ProductInfo> productList();
}
