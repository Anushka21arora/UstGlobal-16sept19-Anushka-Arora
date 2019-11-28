package com.ustglobal.employeeapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpSearchServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String empid = req.getParameter("id1");
		int id = Integer.parseInt(empid);

		PrintWriter out = resp.getWriter();

		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		//String sql = "select * from employee_info where id=?";//if doing thid then set otherwise no need
		String sql = "select * from employee_info where id="+id;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				out.println("<html>");
				out.println("<body>");

				
				  /*out.println("<table>"); 
				  out.println("<tr>"); 
				  out.println("<td> Name</td>");
				  out.println("<td>Id</td>");
				  out.println("<td>salary</td>");
				  out.println("<td>gender</td>");
				  out.println("</tr>");
				 
				   
				  out.println("<tr>"); 
				  out.println("<td>");
				  out.println(name);
				  out.println("</td>"); 
				  out.println("<td>");
				  out.println(Id);
				  out.println("</td>");
				  out.println("<td>");
				  out.printl(sal);
				  out.println("</td>");
				  out.println("<td>");
				  out.println(gender);
				  out.println("</td>");
				  out.println("</tr>"); 
				  out.println("</table>");*/
				 
				out.println("Id is: " + rs.getInt("id"));
				out.println("Name is :" + rs.getString("name"));
				out.println("Salray is :" + rs.getInt("sal"));
				out.println("Gender is :" + rs.getString("gender"));
				out.println("</body>");
				out.println("</html>");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
