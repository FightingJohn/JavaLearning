package com.lyl.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lyl.util.JavaUtils;

public class Homework2 {

	/**
	 * ʵ��һ������ת�˵�demo�����û�AΪboss��ÿ����Ҫ��10��Ա���ֱ𷢹���5000��
		ʵ��һ�������ʵķ������÷���������10����ͬԱ�������ʣ�Ҫ��10��Ա��Ҫô���յ���Ҫô��û�յ����ʡ�
	 */
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			//�������ݿ�����
			conn = JavaUtils.getConn();
			//boss��10�����˷�����5000
			String sql = "UPDATE salary SET money=money+5000 WHERE id=?;";
			//�����ֶ��ύ
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
			System.out.println("��������Ϊ0");
			try {
				//�ع�
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
