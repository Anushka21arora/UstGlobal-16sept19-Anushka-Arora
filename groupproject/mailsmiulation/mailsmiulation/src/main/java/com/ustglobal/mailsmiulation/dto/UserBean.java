package com.ustglobal.mailsmiulation.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class UserBean {
	@GeneratedValue
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column(unique=true)
	private String email;
	@Column
	private String password;
	@Column
	private String ans;
	@OneToMany(mappedBy="user")
	private List<MailBean> mailBean;
	@OneToMany(mappedBy="userBean")
	private List<MailBean> mail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public List<MailBean> getMailBean() {
		return mailBean;
	}
	public void setMailBean(List<MailBean> mailBean) {
		this.mailBean = mailBean;
	}
	public List<MailBean> getMail() {
		return mail;
	}
	public void setMail(List<MailBean> mail) {
		this.mail = mail;
	}
	
	

}
