package com.ustglobal.mailsmiulation.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.mailsmiulation.dto.MailBean;
import com.ustglobal.mailsmiulation.dto.UserBean;

@Repository
public class UserDaoImpl implements UserDao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean register(UserBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql = "from UserBean where email=:email";
		TypedQuery<UserBean> query = manager.createQuery(jpql, UserBean.class);
		query.setParameter("email", bean.getEmail());
		try {
			UserBean bean2 = query.getSingleResult();
			return false;

		} catch (Exception e) {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;

		}

	}

	@Override
	public boolean changePassword(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql = "from UserBean where email=:email";
		transaction.begin();
		TypedQuery<UserBean> query = manager.createQuery(jpql, UserBean.class);
		query.setParameter("email", email);
		try {
			UserBean bean = query.getSingleResult();
			UserBean bean2 = manager.find(UserBean.class, bean.getId());
			bean2.setPassword(password);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean check(String email, String ans) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from UserBean where email=:email and ans=:ans";
		TypedQuery<UserBean> query = manager.createQuery(jpql, UserBean.class);
		query.setParameter("email", email);
		query.setParameter("ans", ans);
		try {
			UserBean bean = query.getSingleResult();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean forgotPassword(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql = "from UserBean where email=:email";
		transaction.begin();
		TypedQuery<UserBean> query = manager.createQuery(jpql, UserBean.class);
		query.setParameter("email", email);
		try {
			UserBean bean = query.getSingleResult();
			UserBean bean2 = manager.find(UserBean.class, bean.getId());
			bean2.setPassword(password);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<MailBean> getInbox(int id) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from MailBean where id=:id";
		TypedQuery<MailBean> query = manager.createQuery(jpql, MailBean.class);
		query.setParameter("id", id);
		MailBean mail = query.getSingleResult();
		List<MailBean> mails = new ArrayList<MailBean>();
		mails.add(mail);
		return mails;
	}

	@Override
	public UserBean login(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from UserBean where email=:uemail and password=:pass";
			TypedQuery<UserBean> query = manager.createQuery(jpql, UserBean.class);
			query.setParameter("uemail", email);
			query.setParameter("pass", password);
			UserBean userBean = query.getSingleResult();
			return userBean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
