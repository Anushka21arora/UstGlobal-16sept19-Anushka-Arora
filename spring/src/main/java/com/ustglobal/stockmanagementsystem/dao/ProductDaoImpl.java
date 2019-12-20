package com.ustglobal.stockmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagementsystem.dto.ProductInfo;

@Repository
public class ProductDaoImpl implements ProductDao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public ProductInfo searchByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductInfo where name=:name";
			TypedQuery<ProductInfo> query = manager.createQuery(jpql, ProductInfo.class);
			query.setParameter("name", name);
			ProductInfo product = query.getSingleResult();
			return product;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ProductInfo> searchByCatergory(String category) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductInfo where category=:category";
			TypedQuery<ProductInfo> query = manager.createQuery(jpql, ProductInfo.class);
			query.setParameter("category", category);
			List<ProductInfo> plist = query.getResultList();
			return plist;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	
	}

	@Override
	public List<ProductInfo> searchByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductInfo where company=:company";
			TypedQuery<ProductInfo> query = manager.createQuery(jpql, ProductInfo.class);
			query.setParameter("company", company);
			List<ProductInfo> plist = query.getResultList();
			return plist;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	
	}

	@Override
	public boolean addProduct(ProductInfo bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateProduct(ProductInfo bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ProductInfo info=manager.find(ProductInfo.class, bean.getPid());
		info.setName(bean.getName());
		info.setCompany(bean.getCompany());
		info.setCategory(bean.getCategory());
		info.setPrice(bean.getPrice());
		info.setQty(bean.getQty());
		transaction.commit();
		return true;
	}

	@Override
	public List<ProductInfo> productList() {
		EntityManager manager = factory.createEntityManager();
		String jpql="from ProductInfo";
		TypedQuery<ProductInfo> query = manager.createQuery(jpql, ProductInfo.class);
		List<ProductInfo> list = query.getResultList();
		return list;
		
	}

}
