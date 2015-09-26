package com.lyl.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lyl.bean.User;
import com.lyl.dao.SaveDataInference;
import com.lyl.utils.JavaUtils;

public class SaveToMysql implements SaveDataInference {

	@Override
	public boolean saveData(User user) {
		
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			//建立连接
			conn = JavaUtils.getConn();
			
			String sql = "INSERT INTO users VALUES(?,?,?);";
			pst = conn.prepareStatement(sql);
			//设置输入的信息
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getEmail());
			
			int i = pst.executeUpdate();
			if(i != 0)
				flag = true;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, pst, rs);
		}
		
		return flag;
	}

	
	public boolean findUsername(String username) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			//建立连接
			conn = JavaUtils.getConn();
			
			String sql = "SELECT * FROM users WHERE username=?;";
			pst = conn.prepareStatement(sql);
			//设置输入的信息
			pst.setString(1, username);
			
			rs = pst.executeQuery();
			if(rs.next())
				flag = true;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, pst, rs);
		}
		
		return flag;
	}

	@Override
	public boolean findUser(String username, String password) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			//建立连接
			conn = JavaUtils.getConn();
			
			String sql = "SELECT * FROM users WHERE username=? AND PASSWORD=?;";
			pst = conn.prepareStatement(sql);
			//设置输入的信息
			pst.setString(1, username);
			pst.setString(2, password);
			
			rs = pst.executeQuery();
			if(rs.next())
				flag = true;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, pst, rs);
		}
		
		return flag;
	}

}
