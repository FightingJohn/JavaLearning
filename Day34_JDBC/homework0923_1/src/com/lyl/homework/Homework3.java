package com.lyl.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lyl.util.JavaUtils;

public class Homework3 {

	/**
	 * ÿ�����봦����������ʱ��Ƚ�
	 */
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		//����ʼʱ��
		long startTime = System.currentTimeMillis();
		
		try {
			//��������
			conn = JavaUtils.getConn();
			st = conn.createStatement();
/*			//һ��һ������ ��ʱ    24240 ����
			for(int i=1; i<=1000; i++){
				String str = "INSERT INTO student1 VALUES("+i+",'zhang',60,60,60);";
				st.executeUpdate(str);
			}
			System.out.println("һ��һ�����룬");*/
			
			
			//������    22840����
			for(int i=1; i<=1000; i++){
				String str = "INSERT INTO student1 VALUES("+i+",'zhang',60,60,60);";
				st.addBatch(str);
				if(i % 100 == 0)
					st.executeBatch();
			}
//			st.executeBatch();
			st.clearBatch();
			System.out.println("������");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, st, rs);
		}
		
		
		//�������ʱ��
		long endTime = System.currentTimeMillis();
		
		System.out.println("���������ʱ��"+(endTime - startTime));

	}
	

}
