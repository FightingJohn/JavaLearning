package com.lyl.transaction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lyl.util.JavaUtils;

public class Transaction1 {

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
			
			//设置隔离级别
//			conn.setTransactionIsolation(conn.TRANSACTION_SERIALIZABLE);	//对应int为8
//			conn.setTransactionIsolation(conn.TRANSACTION_REPEATABLE_READ);	//对应int为4 默认情况
//			conn.setTransactionIsolation(conn.TRANSACTION_READ_COMMITTED);	//对应int为2
//			conn.setTransactionIsolation(conn.TRANSACTION_READ_UNCOMMITTED);//对应int为1
//			conn.setTransactionIsolation(conn.TRANSACTION_NONE);			//会报错-Transaction isolation level NONE not supported by MySQL
			//关闭数据自动提交
			conn.setAutoCommit(false);
			//获得此Connection的隔离级别
			System.out.println(conn.getTransactionIsolation());
			
			st.executeUpdate("UPDATE users SET money=money-1000 WHERE id = 4;");
			st.executeUpdate("UPDATE users SET money=money+1000 WHERE id = 3;");
			
			//提交
			conn.commit();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, st, rs);
		}

	}

}
