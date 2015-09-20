package com.lyl.homework2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Homework2 extends HttpServlet {

	//测试session的一些函数
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        HttpSession session = request.getSession(true);

        // print session info

        Date created = new Date(session.getCreationTime());
        Date accessed = new Date(session.getLastAccessedTime());
        out.println("ID " + session.getId()+"<br>");
        out.println("Created: " + created+"<br>");
        out.println("Last Accessed: " + accessed+"<br>");

        // set session info if needed
        
//        session.setAttribute("Name", "zhansan");
//        session.setAttribute("Value", "23");
//        session.setAttribute("Name", "lisi");
//        session.setAttribute("Value", "45");

//        String dataName = request.getParameter("dataName");
//        if (dataName != null && dataName.length() > 0) {
//            String dataValue = request.getParameter("dataValue");
//            session.setAttribute(dataName, dataValue);
//        }

        // print session contents

        
        Enumeration e = session.getAttributeNames();
        while (e.hasMoreElements()) {
            String name = (String)e.nextElement();
            String value = session.getAttribute(name).toString();
            out.println(name + " = " + value+"<br>");
        }

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
