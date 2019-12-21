package com.ustglobal.mailsmiulation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.mailsmiulation.dto.MailBean;
import com.ustglobal.mailsmiulation.dto.ReturnResponse;
import com.ustglobal.mailsmiulation.dto.UserBean;
import com.ustglobal.mailsmiulation.service.UserService;
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
@RestController
public class AppController {
	@Autowired
	private UserService service;
	@PostMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ReturnResponse register(@RequestBody UserBean bean) {
		ReturnResponse response = new ReturnResponse();
		boolean check=service.register(bean);
		if (check) {
			response.setStatusCode(201);
			response.setMessage("Registered Succesfully");
			response.setDescription("Registered Succesfully");
		} else if(check==false) {
			response.setStatusCode(401);
			response.setMessage("Email alreay exists");
			response.setDescription("Try again ....");
		}else {
			response.setStatusCode(401);
			response.setMessage("Registration Failed....");
			response.setDescription("Try again ....");
		}
		return response;
	}// end of register
	@PostMapping(path = "/changepassword", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ReturnResponse changePassword(@RequestBody UserBean bean) {

		ReturnResponse response = new ReturnResponse();
		if (service.changePassword(bean.getEmail(), bean.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("Password changed Succesfully");
			response.setDescription("Success");
		} else {
			response.setStatusCode(401);
			response.setMessage("Password Not Changed");
			response.setDescription("Failure");
		}
		return response;

	}// end of changePassword
	@GetMapping(path = "/check", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ReturnResponse check(@RequestParam("email")String email,@RequestParam("ans")String ans) {

		ReturnResponse response = new ReturnResponse();
		if (service.check(email, ans)) {
			response.setStatusCode(201);
			response.setMessage("Pet Name Matched");
			response.setDescription("Success");
		} else {
			response.setStatusCode(401);
			response.setMessage("Pet name not Matched");
			response.setDescription("Failure");
		}
		return response;

	}// end of check
	@GetMapping(path = "/forgot-pass", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ReturnResponse forgotPassword(@RequestParam("email")String email,@RequestParam("password")String password) {

		ReturnResponse response = new ReturnResponse();
		if (service.forgotPassword(email, password)) {
			response.setStatusCode(201);
			response.setMessage("Password changed Sucessfully");
			response.setDescription("Success");
		} else {
			response.setStatusCode(401);
			response.setMessage("Password not Changed");
			response.setDescription("Failure");
		}
		return response;

	}// end of forgotPassword
	@GetMapping(path="/inbox",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MailBean> inboxGet(@RequestParam("id") int id) {
		
		
		System.out.println("raeched*********************");
		
		List<MailBean> bean = service.getInbox(id);
		if(bean!= null) {
			return bean;
		}else {
			return null;
		}
				
	}//end of inbox
	@PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ReturnResponse login(@RequestBody UserBean bean) {
		ReturnResponse response = new ReturnResponse();
		UserBean userBean=service.login(bean.getEmail(), bean.getPassword());
		if (userBean != null) {
			response.setStatusCode(201);
			response.setMessage("Login Succesfully");
			response.setDescription("Login Succesfully");
			response.setUserBean(userBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Credential Not Match");
			response.setDescription("Try again ....");
		}
		return response;
	}// end of login



}
