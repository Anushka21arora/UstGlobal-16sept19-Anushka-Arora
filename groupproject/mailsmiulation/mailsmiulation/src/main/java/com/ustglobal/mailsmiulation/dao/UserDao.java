package com.ustglobal.mailsmiulation.dao;

import java.util.List;

import com.ustglobal.mailsmiulation.dto.MailBean;
import com.ustglobal.mailsmiulation.dto.UserBean;

public interface UserDao {
public UserBean login(String email,String password);
public boolean register(UserBean bean);
public boolean changePassword(String email,String password);
public boolean check(String email,String ans);
public boolean forgotPassword(String email,String password);
public List<MailBean> getInbox(int id);
}
