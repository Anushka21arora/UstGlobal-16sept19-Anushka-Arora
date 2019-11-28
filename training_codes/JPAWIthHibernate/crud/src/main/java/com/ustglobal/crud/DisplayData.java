package com.ustglobal.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.crud.dto.Student;

public class DisplayData {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Student studentDetail=entityManager.find(Student.class, 1);
        System.out.println("ID is :"+studentDetail.getId()); 
        System.out.println("Name is :"+studentDetail.getName());
        System.out.println("Email is :"+studentDetail.getEmail());
        entityManager.close();
	}
}
