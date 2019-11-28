package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDemo {
public static void main(String[] args) {
	 EntityTransaction entityTransaction = null;
     EntityManager entityManager = null;
     try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	     entityManager= entityManagerFactory.createEntityManager();
	     entityTransaction=  entityManager.getTransaction();
	     entityTransaction.begin();
	     String jpql ="delete from Product where pid=102";
	     Query query = entityManager.createQuery(jpql);
	     int count =query.executeUpdate();
	     System.out.println(count+ "Row Deleted");
	     entityTransaction.commit();
     
     
     
     } catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}finally {
		 entityManager.close();
	}
    
}
}
