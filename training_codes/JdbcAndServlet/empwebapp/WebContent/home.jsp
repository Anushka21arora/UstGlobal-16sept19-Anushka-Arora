<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="info" class="com.ustglobal.empwebapp.dto.EmployeeInfo" scope="session"></jsp:useBean>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href ='./logout' style="float:right;">Logout</a>
<h1>Welcome <%=info.getName() %></h1>
<a href ='./search.html'>Search</a>
<a href ='./changepassword.jsp'>Change Password</a>

</body>
</html>