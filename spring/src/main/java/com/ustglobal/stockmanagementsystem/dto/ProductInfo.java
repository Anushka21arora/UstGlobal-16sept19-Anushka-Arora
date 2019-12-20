package com.ustglobal.stockmanagementsystem.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "prodcut_info")
public class ProductInfo {
	@Id
	@GeneratedValue
	@Column
	private int pid;
	@Column(unique=true)
	private String name;
	@Column
	private String category;
	@Column
	private String company;
	@Column
	private int qty;
	@Column
	private double price;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="order_history_info",joinColumns=@JoinColumn(name="pid"),inverseJoinColumns=@JoinColumn(name="order_id"))
	private List<OrderInfo> order;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<OrderInfo> getOrder() {
		return order;
	}
	public void setOrder(List<OrderInfo> order) {
		this.order = order;
	}
	

}
