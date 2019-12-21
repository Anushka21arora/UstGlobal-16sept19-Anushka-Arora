package com.ustglobal.mailsmiulation.dto;

import java.util.List;

public class ReturnResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<MailBean> mailBean;
	private UserBean userBean;
	
	public List<MailBean> getMailBean() {
		return mailBean;
	}
	public void setMailBean(List<MailBean> mailBean) {
		this.mailBean = mailBean;
	}
	public UserBean getUserBean() {
		return userBean;
	}
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
