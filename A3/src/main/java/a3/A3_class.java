package a3;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class A3_class extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doGet(req, resp);
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	
	PrintWriter out=resp.getWriter();
	out.println("Your name is "+name);
	out.println("Your email is "+email);
	out.println("Your password is "+password);
	
	
}
}
