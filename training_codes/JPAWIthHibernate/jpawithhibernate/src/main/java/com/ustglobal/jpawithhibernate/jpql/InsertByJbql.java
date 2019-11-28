package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertByJbql {
	public static void main(String[] args) {
		/*EntityTransaction entityTransaction =null;
		EntityManager entityManager =null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jbql = "insert into Product values(:id,:name,:qty)";
			Query query = entityManager.createQuery(jbql);
			query.setParameter("id", 101);
			query.setParameter("name", "lays");
			query.setParameter("qty", 5);
			int count = query.executeUpdate();
			System.out.println(count + "Row Inserted");
			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		} finally {
			entityManager.close();
		}
*/	}
}
