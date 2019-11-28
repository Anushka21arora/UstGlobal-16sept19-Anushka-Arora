<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<body>
<a href="./home" >Home</a>
<a href="./logout" style="float:right">Logout</a>
<h4><%=msg %></h4>
	<fieldset>
		<legend align="center">Change password</legend>
	
		
		<form action="./changepassword" method="post">
			<table align="center">
				
				<tr>
					<td>New Password :</td>
					<td><input type="password" name="newpassword"></td>
				</tr>

				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="change"></td>
				</tr>
			</table>


		</form>
	</fieldset>


</body>
</html>