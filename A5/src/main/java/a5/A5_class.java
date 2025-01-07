package a5;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class A5_class extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doGet(req, resp);
	String google=req.getParameter("google");
	
	String youtube=req.getParameter("youtube");
	
	//for google
	resp.sendRedirect("https://www.google.co.in/search?q="+google);
	
////	//for youtube
//	resp.sendRedirect("https://www.youtube.com/results?search_query="+youtube);
	
}
}
