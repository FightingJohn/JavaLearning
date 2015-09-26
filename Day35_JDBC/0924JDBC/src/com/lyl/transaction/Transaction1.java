package com.lyl.transaction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lyl.util.JavaUtils;

public class Transaction1 {

	/**
	 * ����������������񣬻ع�
	 */
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		
		try {
			//��������
			conn = JavaUtils.getConn();
			//���Statement����
			st = conn.createStatement();
			
			//���ø��뼶��
//			conn.setTransactionIsolation(conn.TRANSACTION_SERIALIZABLE);	//��ӦintΪ8
//			conn.setTransactionIsolation(conn.TRANSACTION_REPEATABLE_READ);	//��ӦintΪ4 Ĭ�����
//			conn.setTransactionIsolation(conn.TRANSACTION_READ_COMMITTED);	//��ӦintΪ2
//			conn.setTransactionIsolation(conn.TRANSACTION_READ_UNCOMMITTED);//��ӦintΪ1
//			conn.setTransactionIsolation(conn.TRANSACTION_NONE);			//�ᱨ��-Transaction isolation level NONE not supported by MySQL
			//�ر������Զ��ύ
			conn.setAutoCommit(false);
			//��ô�Connection�ĸ��뼶��
			System.out.println(conn.getTransactionIsolation());
			
			st.executeUpdate("UPDATE users SET money=money-1000 WHERE id = 4;");
			st.executeUpdate("UPDATE users SET money=money+1000 WHERE id = 3;");
			
			//�ύ
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
