package com.ustglobal.jpawithhibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetomany.Pencil;
import com.ustglobal.jpawithhibernate.onetomany.PencilBox;

public class TestManyToMany {
	public static void main(String[] args) {
		Course c = new Course();
		c.setCid(100);
		c.setName("JAVA");

		Course c1 = new Course();
		c1.setCid(101);
		c1.setName("PYTHON");

		Course c2 = new Course();
		c2.setCid(102);
		c2.setName("HIBERNATE");

		Student s = new Student();
		s.setSid(1);
		s.setSname("Anu");

		List<Course> courseList = new ArrayList<Course>();
		courseList.add(c);
		courseList.add(c1);
		courseList.add(c2);
        s.setCourse(courseList);
		
		Student s1 = new Student();
		s1.setSid(2);
		s1.setSname("Reshu");
		List<Course> courseList1 = new ArrayList<Course>();
		courseList1.add(c);
		courseList1.add(c1);
		s.setCourse(courseList1);
		
		
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
            /*entityManager.persist(s);
            entityManager.persist(s1);*/
			Course courseInfo =entityManager.find(Course.class, 100);
            List<Student> student = courseInfo.getStudent();
            for (Student student2 : student) {
				System.out.println("student ID: "+student2.getSid());
				System.out.println("student name: "+student2.getSname());
            }
			
			System.out.println("saved");
            
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
