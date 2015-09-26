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
			//��������
			conn = JavaUtils.getConn();
			
			//��ѯ���
			String str = "SELECT * FROM users;";
			ps = conn.prepareStatement(str);
			ps.execute();
			rs = ps.getResultSet();
			//����users���е������û���Ϣ
			boolean flag = false;			//�ж��Ƿ��¼�ɹ��ı��
			while(rs.next()){
				String uname = rs.getString("username");
				String pw = rs.getString("password");
				//�����ݿ���ȡ�������û���Ϣ��username��password����ƥ��
				if(uname.equals(username) && pw.equals(password)){
					response.getWriter().write("��¼�ɹ�");
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
