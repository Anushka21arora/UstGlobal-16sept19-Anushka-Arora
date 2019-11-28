package com.ustglobal.jpawithhibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetomany.Pencil;
import com.ustglobal.jpawithhibernate.onetomany.PencilBox;

public class TestManyToOne {
public static void main(String[] args) {
	PencilBox pb = new PencilBox();
	pb.setBid(1);
	pb.setBname("myBox");
	Pencil p = new Pencil();
	p.setColor("Red");
	p.setPid(01);
	p.setPencilBox(pb);
	
	Pencil p1 = new Pencil();
	p1.setColor("black");
	p1.setPid(02);
	p1.setPencilBox(pb);
	
	EntityTransaction entityTransaction= null;
	EntityManager entityManager= null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		/*entityManager.persist(p); //one to many unidirectional
		entityManager.persist(p1);*/
		
		PencilBox pencilBox1 = entityManager.find(PencilBox.class, 1);
		List<Pencil> l = pencilBox1.getPencil();
		for (Pencil pencil : l) {
			System.out.println("Color is "+pencil.getColor());
			System.out.println("Id is  "+pencil.getPid());
			System.out.println("-------------------------");
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
