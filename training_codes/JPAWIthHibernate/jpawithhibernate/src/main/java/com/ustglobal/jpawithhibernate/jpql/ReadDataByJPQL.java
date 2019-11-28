package com.ustglobal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReadDataByJPQL {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	    //selects all the data 
		/*String jpql ="from Product";
	    
		Query query = entityManager.createQuery(jpql);
	    // ArrayList<Product> al =(ArrayList<Product>) query.getResultList();
	    List<Product> productInfo=query.getResultList();
		for (Product product : productInfo) {
			System.out.println(product.getPid());
			System.out.println(product.getPname());
			System.out.println(product.getQuantity());
		}*/
		
		//selects only product name 
		String jpql ="select pname from Product";
		Query query = entityManager.createQuery(jpql);
		List<String> productInfo=query.getResultList();
		for (String product : productInfo) {
			System.out.println(product);
			
	
	}
}
}
