package com.lyl.transaction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lyl.util.JavaUtils;

public class TransactionRollback {

	/**
	 * 事务操作，设置事务，回滚
	 */
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		
		try {
			//建立连接
			conn = JavaUtils.getConn();
			//获得Statement对象
			st = conn.createStatement();
			
			//关闭数据自动提交
			conn.setAutoCommit(false);
			
			st.executeUpdate("UPDATE users SET money=money-1000 WHERE id = 4;");
			//设置一个运行时异常
			int i = 10 / 0;
			st.executeUpdate("UPDATE users SET money=money+1000 WHERE id = 3;");
			
			//提交
			conn.commit();
			
			
		}catch(ArithmeticException e){
			System.out.println("除数不能为 0 ");
			try {
				conn.rollback();
				conn.commit();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, st, rs);
		}

	}

}
