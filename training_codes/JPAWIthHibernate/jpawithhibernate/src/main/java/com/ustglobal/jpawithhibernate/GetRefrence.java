package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class GetRefrence {
	public static void main(String[] args) {
      EntityManager entityManager = null;
      EntityTransaction entityTransaction = null;
     
    	  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
    	  entityManager = entityManagerFactory.createEntityManager();
    	  Product product = entityManager.getReference(Product.class, 101);
    	 System.out.println("ID is "+product.getPid());
    	 System.out.println("Name is "+product.getPname());
    	 System.out.println("Quantity is "+product.getQuantity());
	 entityManager.close();
	}//end of main
}//end of Getrefrence
