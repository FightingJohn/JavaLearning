package com.lyl.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lyl.utils.JavaUtils;

public class Homework4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Connection conn = null;
		PreparedStatement ps = null;

		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		try {
			//建立连接
			conn = JavaUtils.getConn();
			
			//插入语句
			String str = "INSERT INTO users VALUES(?,?);";
			ps = conn.prepareStatement(str);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.execute();
			
			response.getWriter().write("注册成功");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, ps, null);
		}
	}

}
