package com.ustglobal.mailsmiulation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.mailsmiulation.dao.UserDao;
import com.ustglobal.mailsmiulation.dto.MailBean;
import com.ustglobal.mailsmiulation.dto.UserBean;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;

	@Override
	public boolean register(UserBean bean) {
		return dao.register(bean);
	}

	@Override
	public boolean changePassword(String email, String password) {
		return dao.changePassword(email, password);
	}

	@Override
	public boolean check(String email, String ans) {
		return dao.check(email, ans);
	}

	@Override
	public boolean forgotPassword(String email, String password) {
		return dao.forgotPassword(email, password);
	}

	@Override
	public List<MailBean> getInbox(int id) {
		return dao.getInbox(id);
	}

	@Override
	public UserBean login(String email, String password) {

		return dao.login(email, password);
	}

}
