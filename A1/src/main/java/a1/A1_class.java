package a1;
import java.util.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
public class A1_class extends HttpServlet{
@Override
protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.service(arg0, arg1);
	String myname=arg0.getParameter("name");
	String myemail=arg0.getParameter("email");
	String myaddress=arg0.getParameter("address");
	String mystudentid=arg0.getParameter("student id");
	String myuniroll=arg0.getParameter("university roll number");
	String myclassroll=arg0.getParameter("class roll number");
	String mybranch=arg0.getParameter("branch name");
	String mybranchname=arg0.getParameter("branch name q");
	
	// in terminal 
	System.out.println("Hello JAKARTA developer");
	
	// in browser
	PrintWriter out=arg1.getWriter();
	out.println("Welcome To Jakarta Web developes Database");
	out.println("Welcome "+myname);
	out.println("Your email "+myemail);
	out.println("Your address "+myaddress);
	out.println("Student id "+mystudentid);
	out.println("University roll number "+myuniroll);
	out.println("Class roll number "+myclassroll);
	out.println("Branch "+mybranch);
	out.println("Branch name "+mybranchname);
}
}
