package com.lyl.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lyl.util.JavaUtils;

public class SecondJdbcDemo {

	/**
	 * PreparedStatement ʱ���� ɾ �� �飬�Լ����������
	 */
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			//���Connection����
			conn = JavaUtils.getConn();
			
			//��
/*			String addStr = "INSERT INTO users VALUES(6,'kangkang','2010-7-22',5500);";
			
			//���PreparedStatement���󣬲�����sql���
			pst = conn.prepareStatement(addStr);
			boolean flag = pst.execute();
			if(!flag)
				System.out.println("��ӳɹ�");*/
			
			//ɾ
/*			String deleteStr = "DELETE FROM users WHERE id = 6;";
			
			//���PreparedStatement���󣬲�����sql���
			pst = conn.prepareStatement(deleteStr);
			boolean flag = pst.execute();
			if(!flag)
				System.out.println("ɾ���ɹ�");*/
			
			//��
/*			String updateStr = "UPDATE users SET money=3000 WHERE id = 5;";
			
			//���PreparedStatement���󣬲�����sql���
			pst = conn.prepareStatement(updateStr);
			boolean flag = pst.execute();
			if(!flag)
				System.out.println("�޸ĳɹ�");*/
			
			//��
/*			String queryStr = "SELECT * FROM users;";
			
			//���PreparedStatement���󣬲�����sql���
			pst = conn.prepareStatement(queryStr);
			boolean flag = pst.execute();
			if(flag)
				System.out.println("��ѯ�ɹ�");
			//���ResultSet���󣬴�ӡ��ѯ���
			rs = pst.getResultSet();
			while(rs.next()){
				System.out.println("id = "+ rs.getInt("id")+
						" name = "+ rs.getString("name")+
						" birthday = "+ rs.getDate("birthday")+
						" money = "+ rs.getFloat("money"));
			}*/
			
			//���������
			String addStr = "INSERT INTO users VALUES(?,?,?,?);";		//����ʾ���Դ������
			pst = conn.prepareStatement(addStr);
			//�������
			for(int i=6; i<10; i++){
				pst.setInt(1, i);
				pst.setString(2, "John"+i);
				pst.setDate(3, new Date(System.currentTimeMillis()+i));
				pst.setFloat(4, i*1000);
				//��ӵ�һ������������
				pst.addBatch();
			}
			pst.executeBatch();
			pst.clearBatch();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, pst, rs);
		}

	}

}
