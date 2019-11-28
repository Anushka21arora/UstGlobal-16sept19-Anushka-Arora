package com.ustglobal.empwebapp.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = "";
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<fieldset>");
		out.println("<legend align='center'>LOGIN</legend>");
		out.println("<form action='./login' method ='post'>");
		out.println("<table align='center'>");
		out.println("<tr>");
		out.println("<td>ID:</td>");
		out.println("<td><input type='number' name='id' value='" + id + "'></td>");
		out.println("</tr>");
		out.println("<tr><td>Password:</td>");
		out.println("<td><input type='password' name='password'></td></tr>");
		out.println("<tr><td></td>");
		out.println("<td><input type='checkbox' name='remember' value='checked'>Remember Me</td></tr>");
		out.println("<tr><td><input type='reset'  value='Reset'></td>");
		out.println("<td><input type='submit'  value='login'></td></tr>");
		out.println("<tr><td></td>");
		out.println("<td><a href='./register.html'>Register</a></td></tr>");
		out.println("</table></form></fieldset>");
		out.println("<body>");
		out.println("</html>");

	}// end of doGet()
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}// end of LoginPageServlet
