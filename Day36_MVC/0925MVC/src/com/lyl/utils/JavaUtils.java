package com.lyl.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 工具类
 * @author 木木
 *
 */
public class JavaUtils {
	
	//私有的构造方法，表示不能实例化
	private JavaUtils(){}
	
	//静态方法返回Connection类型的对象
	public static Connection getConn() throws SQLException, ClassNotFoundException{
		
		String url = "jdbc:mysql://localhost:3306/mydb1";
		String user = "root";
		String password = "li1992";
		
		//1，注册驱动 方法一
//		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//注册驱动 方法二
		Class.forName("com.mysql.jdbc.Driver");
		
		//2，建立连接
		Connection conn = DriverManager.getConnection(url, user, password);
		
		return conn;
	}
	
	//静态方法释放资源
	public static void free(Connection conn, Statement stat, ResultSet rs){
		if(rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				rs = null;			//避免rs为野指针
			}
		
		if(stat != null)
			try {
				stat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				stat = null;			//避免stat为野指针
			}
		
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				conn = null;			//避免conn为野指针
			}
	}

}
