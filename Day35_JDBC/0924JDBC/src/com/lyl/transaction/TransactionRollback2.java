package com.lyl.transaction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import com.lyl.util.JavaUtils;

public class TransactionRollback2 {

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
			
			//�ر������Զ��ύ
			conn.setAutoCommit(false);
			
			st.executeUpdate("UPDATE users SET money=money-1000 WHERE id = 4;");
			//���ûع���
			Savepoint sp = conn.setSavepoint();
			st.executeUpdate("UPDATE users SET money=money+1000 WHERE id = 3;");
			
			//�ع����ع���
			conn.rollback(sp);
			//�ύ
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
