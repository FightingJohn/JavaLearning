package com.lyl.transaction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lyl.util.JavaUtils;

public class TransactionRollback {

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
			//����һ������ʱ�쳣
			int i = 10 / 0;
			st.executeUpdate("UPDATE users SET money=money+1000 WHERE id = 3;");
			
			//�ύ
			conn.commit();
			
			
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ 0 ");
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
