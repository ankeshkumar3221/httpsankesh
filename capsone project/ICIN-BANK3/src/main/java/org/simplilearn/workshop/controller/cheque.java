package org.simplilearn.workshop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.workshop.util.StringUtil;

@WebServlet("/cheque")
public class cheque extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("JDBC driver loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	response.setContentType("text/html");
	
	PrintWriter out = response.getWriter();
	out.println("<HTML>");
	out.println("<HEAD>");
	out.println("<TITLE> Display All Users </TITLE>");
	out.println("<STYLE>");
	out.println("BODY{BACKGROUND-COLOR:GREEN}");
	out.println("</STYLE>");
	out.println("</HEAD>");
	out.println("<BODY>");
	out.println("<CENTER>");
	out.println("<BR><H2>Displaying All Users </H2>");
	out.println("<BR>");
	out.println("<BR>");
	out.println("<TABLE width=\"50%\" bgcolor=\"#92a8d1\" align=\"center\">");
	out.println("<TR>");
	out.println("<TH>User id</TH>");
	out.println("<TH>User name </TH>");
	out.println("<TH>Account</TH>");
	out.println("<TH>Description</TH>");
	out.println("<TH>Confirmation?</TH>");
	out.println("</TR>");
	
	String sql = "SELECT id,user_name,account,desci,confirm FROM cheque";
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login?SSL=false","root","root");
		System.out.println("got connection");
		
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(sql);
		
		while(rs.next()) {
			out.println("<TR>");
			out.println("<TD>"+StringUtil.encodeHtmlTag(rs.getString(1)) + "</TD>");
			out.println("<TD>"+StringUtil.encodeHtmlTag(rs.getString(2)) + "</TD>");
			out.println("<TD>"+StringUtil.encodeHtmlTag(rs.getString(3)) + "</TD>");
			out.println("<TD>"+StringUtil.encodeHtmlTag(rs.getString(4)) + "</TD>");
			out.println("<TD>"+StringUtil.encodeHtmlTag(rs.getString(5)) + "</TD>");
			out.println("</TR>");
		}
		rs.close();
		s.close();
		con.close();
	}catch (SQLException e) {
		//e.printStackTrace();
	}
	
	out.println("</TABLE>");
	out.println("</CENTER>");
	out.println("</BODY>");
	out.println("</HTML>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
