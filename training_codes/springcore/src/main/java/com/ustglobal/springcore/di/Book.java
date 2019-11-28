package com.ustglobal.springcore.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	 public Book(){
	System.out.println("book object is created");	
	}
 @Autowired
 private Author author;
 private String name;
 private int price;
 
 
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@PostConstruct
 public void init() {
	 System.out.println("Init method of Book");
	 
 }
@PreDestroy
 public void destroy() {
	 System.out.println("Destroy method of book");
 }
}
