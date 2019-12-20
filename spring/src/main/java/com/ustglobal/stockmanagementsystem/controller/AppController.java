package com.ustglobal.stockmanagementsystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagementsystem.dto.ProductInfo;
import com.ustglobal.stockmanagementsystem.dto.ReturnResponse;
import com.ustglobal.stockmanagementsystem.service.ProductService;
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
@RestController
public class AppController {
	@Autowired
	private ProductService service;

	@GetMapping(path = "/search-name", produces = MediaType.APPLICATION_JSON_VALUE)
	public ReturnResponse searchProduct(@RequestParam("name") String name) {
		ReturnResponse response = new ReturnResponse();
		ProductInfo product = service.searchByName(name);
		if (product != null) {
			response.setStatusCode(201);
			response.setMessage("Product Found SuccessFully");
			response.setDescription("Success");
			response.setProductInfo(Arrays.asList(product));
		} else {
			response.setStatusCode(401);
			response.setMessage("Product is not Found");
			response.setDescription("Failure");
		}
		return response;

	}// end of searchProduct

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ReturnResponse addProduct(@RequestBody ProductInfo bean) {
		ReturnResponse response = new ReturnResponse();
		if (service.addProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("Product is added Succesfully");
			response.setDescription("Success");
		} else {
			response.setStatusCode(401);
			response.setMessage("Product Not Added");
			response.setDescription("Failure");
		}
		return response;
	}// end of addProduct

	@GetMapping(path = "/search-category", produces = MediaType.APPLICATION_JSON_VALUE)
	public ReturnResponse searchByCategory(@RequestParam("category") String category) {
		ReturnResponse response = new ReturnResponse();
		List<ProductInfo> product = service.searchByCatergory(category);
		if (!product.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Product Found SuccessFully");
			response.setDescription("Success");
			response.setProductInfo(product);
		} else {
			response.setStatusCode(401);
			response.setMessage("Product is not Found");
			response.setDescription("Failure");
		}
		return response;

	}// end of searchByCategory

	@GetMapping(path = "/search-company", produces = MediaType.APPLICATION_JSON_VALUE)
	public ReturnResponse searchByCompany(@RequestParam("company") String company) {
		ReturnResponse response = new ReturnResponse();
		List<ProductInfo> product = service.searchByCompany(company);
		if (!product.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Product Found SuccessFully");
			response.setDescription("Success");
			response.setProductInfo(product);
		} else {
			response.setStatusCode(401);
			response.setMessage("Product is not Found");
			response.setDescription("Failure");
		}
		return response;

	}// end of searchByCompany
	
	@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ReturnResponse updateProduct(@RequestBody ProductInfo bean) {
		
		ReturnResponse response = new ReturnResponse();
		if (service.updateProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product is updated Succesfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Not updated... ");
		}
		return response;
		
	}//end of updateProduct
	@GetMapping(path = "/all-product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ReturnResponse allProduct() {
		ReturnResponse response = new ReturnResponse();
		List<ProductInfo> info = service.productList();
		if (!info.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Products found Succesfully");
			response.setProductInfo(info);;
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product Not found");
		}
		return response;

	}// end of allProduct

}
