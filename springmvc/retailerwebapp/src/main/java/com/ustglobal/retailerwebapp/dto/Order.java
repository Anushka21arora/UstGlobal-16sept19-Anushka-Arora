package com.ustglobal.retailerwebapp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderInfo")
public class Order {
	@Id
	@Column
	
	private int orderId;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="productName",nullable=false)
	private Product product;
	@Column
	private int price;
	@Column
	private double quantity;
	@Column
	private double amount;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="retailerId",nullable=false)
	private Retailer retailer;

	public Retailer getRetailer() {
		return retailer;
	}

	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	

}