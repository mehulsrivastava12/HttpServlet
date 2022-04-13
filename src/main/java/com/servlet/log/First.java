package com.servlet.log;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class First extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out= res.getWriter();
		String name=req.getParameter("uname");
		out.println("Hello "+name+" Good Morning,This is doGet method()");
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out=res.getWriter();
		String name=req.getParameter("uname");
		out.println("Hello "+name+" Good Morning, This is doPost method()");
	}
}