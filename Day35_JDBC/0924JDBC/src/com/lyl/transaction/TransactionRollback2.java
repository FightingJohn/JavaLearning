package com.lyl.transaction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import com.lyl.util.JavaUtils;

public class TransactionRollback2 {

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
			//设置回滚点
			Savepoint sp = conn.setSavepoint();
			st.executeUpdate("UPDATE users SET money=money+1000 WHERE id = 3;");
			
			//回滚到回滚点
			conn.rollback(sp);
			//提交
			conn.commit();
			
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, st, rs);
		}

	}

}
