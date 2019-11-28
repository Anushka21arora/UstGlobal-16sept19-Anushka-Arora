package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetoone.Person;
import com.ustglobal.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {
public static void main(String[] args) {
	VoterCard vc= new VoterCard();
	vc.setVid(10);
	vc.setVname("anu");
	Person p = new Person();
	p.setPid(10);
	p.setName("anu");
	p.setVoterCard(vc);
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		VoterCard vCard =entityManager.find(VoterCard.class, 10);
		System.out.println(vCard.getPerson().getPid());//for bidirectional 
		System.out.println(vCard.getPerson().getName());
		
		
		//entityManager.persist(p); for unidirectional
		System.out.println("Record Saved");
		entityTransaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}
}
