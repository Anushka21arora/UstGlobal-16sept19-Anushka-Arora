package com.ustglobal.stockmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagementsystem.dao.ProductDao;
import com.ustglobal.stockmanagementsystem.dto.ProductInfo;
@Service
public class ProductServiceImpl implements ProductService{
@Autowired
private ProductDao dao;

@Override
public ProductInfo searchByName(String name) {
	return dao.searchByName(name);
}

@Override
public List<ProductInfo> searchByCatergory(String category) {
	return dao.searchByCatergory(category);
}

@Override
public List<ProductInfo> searchByCompany(String company) {
	return dao.searchByCompany(company);
}

@Override
public boolean addProduct(ProductInfo bean) {
	
	return dao.addProduct(bean);
}

@Override
public boolean updateProduct(ProductInfo bean) {
	
		return dao.updateProduct(bean);
}

@Override
public List<ProductInfo> productList() {
	
	return dao.productList();
}
	
}
