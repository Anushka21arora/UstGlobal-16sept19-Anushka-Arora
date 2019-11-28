package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReadDemo {
 public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    Product productDetail=entityManager.find(Product.class,101);
    System.out.println("ID is :"+productDetail.getPid()); 
    System.out.println("Product Name is :"+productDetail.getPname());
    System.out.println("Quantity is :"+productDetail.getQuantity());
 }//end of main method
}//end of ReadQuery
