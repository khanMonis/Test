package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet<reqDispatcher> extends HttpServlet {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<h2>Welcome to Register Servlet</h2>");
	String name=req.getParameter("user_name");
	String password=req.getParameter("user_password");
	String gender=req.getParameter("user_gender");
	String email=req.getParameter("user_email");
	String course=req.getParameter("user_course");
	
	String cond=req.getParameter("condition");
	if (cond!=null) {
	
    if(cond.equals("checked")) {
        out.println("<h2> Name :"+ name +"</h2>");
        out.println("<h2> Password :"+ password+"</h2>");
        out.println("<h2> Gender:"+ gender +"</h2>");
        out.println("<h2> Email:"+ email+"</h2>");
        out.println("<h2> Course :"+ course +"</h2>");
        //
        ///JDBC
        //
        //saved to db
        //   ...
        RequestDispatcher rd=req.getRequestDispatcher("succes");
        rd.forward(req,res);
}else {
out.println("<h2>You have not accepted terms and conditions</h2>");
}
}else {
	out.println("<h2>You have not accepted terms and conditions</h2>");
	/// i want to include output of index.html
	/// get the object of RequestDispatcher
	RequestDispatcher rd=req.getRequestDispatcher("index.html");
	//include
	 rd.include(req,res);

}
}
}

