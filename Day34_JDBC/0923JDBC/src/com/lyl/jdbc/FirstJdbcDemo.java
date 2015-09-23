package com.lyl.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lyl.util.JavaUtils;

public class FirstJdbcDemo {

	/**
	 * ʵ�ֶ����ݿ���� ɾ �� �顣�Լ�statementʱ�����������
	 */
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement sta = null;
		ResultSet rs = null;
		
		//���ù�����ľ�̬���������Connection����
		try {
			conn = JavaUtils.getConn();
			sta = conn.createStatement();
			
			//��
/*			String addStr = "INSERT INTO users VALUES(3,'luck','2000-03-22',5000);";
			int i = sta.executeUpdate(addStr);
			if(i != 0)
				System.out.println("��ӳɹ�");*/
			
			//��
/*			String queryStr = "SELECT * FROM users;";
			rs = sta.executeQuery(queryStr);
			//��ӡ��ѯ���
			while(rs.next()){
				System.out.println("id = "+ rs.getInt("id")+
						" name = "+ rs.getString("name")+
						" birthday = "+ rs.getDate("birthday")+
						" money = "+ rs.getFloat("money"));
			}*/
			
			//��
/*			String updateStr = "UPDATE users SET money=3000 WHERE id = 1;";
			int i = sta.executeUpdate(updateStr);
			if(i != 0)
				System.out.println("�޸ĳɹ�");*/
			
			//ɾ
/*			String deleteStr = "DELETE FROM users WHERE id = 3;";
			int i = sta.executeUpdate(deleteStr);
			if(i != 0)
				System.out.println("ɾ���ɹ�");*/
			
			//������
			String addStr1 = "INSERT INTO users VALUES(3,'luck','2000-03-22',4000);";
			String addSt2 = "INSERT INTO users VALUES(4,'maria','1999-11-2',3000);";
			String addStr3 = "INSERT INTO users VALUES(5,'demon','2004-8-21',7000);";
			sta.addBatch(addStr1);
			sta.addBatch(addSt2);
			sta.addBatch(addStr3);
			int[] arr = sta.executeBatch();	//ִ������������
			for (int i : arr) {
				System.out.println(i);		
			}
			sta.clearBatch();				//�������������
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			//�ͷ���Դ
			JavaUtils.free(conn,sta,rs);
		}

	}

}
