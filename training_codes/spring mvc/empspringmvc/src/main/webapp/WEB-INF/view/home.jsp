<%@page import="com.ustglobal.empspringmvc.dto.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	EmployeeBean bean = (EmployeeBean) session.getAttribute("bean");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change password</a>
	<a href="./update">Update Profile</a>
	<a href="./delete">Delete Profile</a>
	<a href="./logout" style="float: right;">Logout</a>
	<h2>
		Welcome
		<%=bean.getName()%>
	</h2>

	<fieldset>
		<legend>Search Employee</legend>
		<form action="./search">
		<table>

			<tr>
				<td>ID:</td>
				<td><input type="number" name="id" /></td>
				<td><input type="submit" value="Search" /></td>
			</tr>

		</table>

		</form>
	</fieldset>
	<%
		EmployeeBean employeeBean = (EmployeeBean) request.getAttribute("bean");
	%>
	<%
		if (employeeBean != null) {
	%>
	<table>
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Date of Joining</th>

		</tr>
		<tr>
			<td><%=employeeBean.getName()%></td>
			<td><%=employeeBean.getEmail()%></td>
			<td><%=employeeBean.getGender()%></td>
			<td><%=employeeBean.getDoj()%></td>
		</tr>
	</table>

	<%
		}
	%>
	<h3>${msg}</h3>
	
</body>
</html>