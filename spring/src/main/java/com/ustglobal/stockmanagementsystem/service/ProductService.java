package com.ustglobal.stockmanagementsystem.service;

import java.util.List;

import com.ustglobal.stockmanagementsystem.dto.ProductInfo;

public interface ProductService {
	public ProductInfo searchByName(String name);

	public List<ProductInfo> searchByCatergory(String category);

	public List<ProductInfo> searchByCompany(String company);

	public boolean addProduct(ProductInfo bean);

	public boolean updateProduct(ProductInfo bean);
	
	public List<ProductInfo> productList();

}
