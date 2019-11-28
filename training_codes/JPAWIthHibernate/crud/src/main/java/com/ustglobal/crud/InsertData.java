package com.ustglobal.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.crud.dto.Student;

public class InsertData {
	public static void main(String[] args) {
     Student student = new Student();
     student.setId(2);
     student.setName("jaggu");
     student.setEmail("jaggu@gmail.com");
	  
     EntityManager entityManager =null;
      EntityTransaction entityTransaction =null;
      try {
    	  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		  entityManager = entityManagerFactory.createEntityManager();
		  entityTransaction = entityManager.getTransaction();
		  entityTransaction.begin();
		  entityManager.persist(student);
		  System.out.println("Record saved");
		  entityTransaction.commit();
		  
		  
	
      } catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
      entityManager.close();
	}
}
