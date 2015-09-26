package com.lyl.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ������
 * @author ľľ
 *
 */
public class JavaUtils {
	
	//˽�еĹ��췽������ʾ����ʵ����
	private JavaUtils(){}
	
	//��̬��������Connection���͵Ķ���
	public static Connection getConn() throws SQLException, ClassNotFoundException{
		
		String url = "jdbc:mysql://localhost:3306/mydb1";
		String user = "root";
		String password = "li1992";
		
		//1��ע������ ����һ
//		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//ע������ ������
		Class.forName("com.mysql.jdbc.Driver");
		
		//2����������
		Connection conn = DriverManager.getConnection(url, user, password);
		
		return conn;
	}
	
	//��̬�����ͷ���Դ
	public static void free(Connection conn, Statement stat, ResultSet rs){
		if(rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				rs = null;			//����rsΪҰָ��
			}
		
		if(stat != null)
			try {
				stat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				stat = null;			//����statΪҰָ��
			}
		
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				conn = null;			//����connΪҰָ��
			}
	}

}
