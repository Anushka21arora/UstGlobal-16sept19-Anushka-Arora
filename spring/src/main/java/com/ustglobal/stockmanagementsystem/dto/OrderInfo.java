package com.ustglobal.stockmanagementsystem.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name = "order_info")
public class OrderInfo {
	@Id
	@GeneratedValue
	@Column
	private int order_id;
	@Column
	private double total_price;
	@Column
	private double price_gst;
	@Exclude
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="order")
	private List<ProductInfo> productInfos;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public double getPrice_gst() {
		return price_gst;
	}
	public void setPrice_gst(double price_gst) {
		this.price_gst = price_gst;
	}
	public List<ProductInfo> getProductInfos() {
		return productInfos;
	}
	public void setProductInfos(List<ProductInfo> productInfos) {
		this.productInfos = productInfos;
	}
	
}
