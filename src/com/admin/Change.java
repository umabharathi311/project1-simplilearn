package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Change
 */
@WebServlet("/Change")
public class Change extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Change() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user="root";
			String password="Abhi@12345";
			String url="jdbc:mysql://localhost:3306/flyjet";
			Connection con=DriverManager.getConnection(url, user, password);
			PreparedStatement ps=con.prepareStatement("select *from admin");
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				if(request.getParameter("new password").equals(request.getParameter("conpassword"))&&request.getParameter("Old password").equals(rs.getString(2))&&!request.getParameter("new password").equals(rs.getString(2)))
				{
					PreparedStatement ps1=con.prepareStatement("update admin set Password=?where Username=?");
					ps1.setString(1, request.getParameter("new password"));
					ps1.setString(2, "UmaBharathi");
					ps1.executeUpdate();
					ps1.close();
					request.getRequestDispatcher("cp.html").include(request,response);
					pw.println("<center<>SPAN style='color:red'>invalid Credentials</SPAN></cemter>");
				}
			}
		}
		catch(Exception e)
		{
			pw.print(e);
		}
	}

}
