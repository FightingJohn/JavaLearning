package com.lyl.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lyl.utils.JavaUtils;

public class Homework5 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			//建立连接
			conn = JavaUtils.getConn();
			
			//查询语句
			String str = "SELECT * FROM users;";
			ps = conn.prepareStatement(str);
			ps.execute();
			rs = ps.getResultSet();
			//遍历users表中的所有用户信息
			boolean flag = false;			//判断是否登录成功的标记
			while(rs.next()){
				String uname = rs.getString("username");
				String pw = rs.getString("password");
				//从数据库中取出来的用户信息与username和password进行匹配
				if(uname.equals(username) && pw.equals(password)){
					response.getWriter().write("登录成功");
					flag = true;
					break;
				}
			}
			if(flag == false){
				response.sendRedirect("../jsp/login.jsp"+"?temp=1");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, ps, rs);
		}
	}

}
