package com.lyl.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lyl.util.JavaUtils;

public class SecondJdbcDemo {

	/**
	 * PreparedStatement 时的添 删 改 查，以及批处理操作
	 */
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			//获得Connection对象
			conn = JavaUtils.getConn();
			
			//添
/*			String addStr = "INSERT INTO users VALUES(6,'kangkang','2010-7-22',5500);";
			
			//获得PreparedStatement对象，并传入sql语句
			pst = conn.prepareStatement(addStr);
			boolean flag = pst.execute();
			if(!flag)
				System.out.println("添加成功");*/
			
			//删
/*			String deleteStr = "DELETE FROM users WHERE id = 6;";
			
			//获得PreparedStatement对象，并传入sql语句
			pst = conn.prepareStatement(deleteStr);
			boolean flag = pst.execute();
			if(!flag)
				System.out.println("删除成功");*/
			
			//改
/*			String updateStr = "UPDATE users SET money=3000 WHERE id = 5;";
			
			//获得PreparedStatement对象，并传入sql语句
			pst = conn.prepareStatement(updateStr);
			boolean flag = pst.execute();
			if(!flag)
				System.out.println("修改成功");*/
			
			//查
/*			String queryStr = "SELECT * FROM users;";
			
			//获得PreparedStatement对象，并传入sql语句
			pst = conn.prepareStatement(queryStr);
			boolean flag = pst.execute();
			if(flag)
				System.out.println("查询成功");
			//获得ResultSet对象，打印查询结果
			rs = pst.getResultSet();
			while(rs.next()){
				System.out.println("id = "+ rs.getInt("id")+
						" name = "+ rs.getString("name")+
						" birthday = "+ rs.getDate("birthday")+
						" money = "+ rs.getFloat("money"));
			}*/
			
			//批处理操作
			String addStr = "INSERT INTO users VALUES(?,?,?,?);";		//？表示可以传入参数
			pst = conn.prepareStatement(addStr);
			//传入参数
			for(int i=6; i<10; i++){
				pst.setInt(1, i);
				pst.setString(2, "John"+i);
				pst.setDate(3, new Date(System.currentTimeMillis()+i));
				pst.setFloat(4, i*1000);
				//添加到一个“货车”中
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
