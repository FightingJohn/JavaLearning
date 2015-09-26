package com.lyl.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lyl.util.JavaUtils;

public class Homework2 {

	/**
	 * 实现一个银行转账的demo程序。用户A为boss，每月需要向10个员工分别发工资5000；
		实现一个发工资的方法，该方法负责向10个不同员工发工资，要求，10个员工要么都收到，要么都没收到工资。
	 */
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			//建立数据库连接
			conn = JavaUtils.getConn();
			//boss向10个工人发工资5000
			String sql = "UPDATE salary SET money=money+5000 WHERE id=?;";
			//设置手动提交
			conn.setAutoCommit(false);
			pst = conn.prepareStatement(sql);
			for(int i=1; i<=10; i++){
				pst.setInt(1, i);
				pst.execute();
				
				if(i==5)
					i = i/0;
			}
			
			conn.commit();
		}catch(ArithmeticException e){ 
			System.out.println("除数不能为0");
			try {
				//回滚
				conn.rollback();
				conn.commit();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, pst, null);
		}

	}

}
