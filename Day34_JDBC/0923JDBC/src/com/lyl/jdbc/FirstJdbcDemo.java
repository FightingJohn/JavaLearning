package com.lyl.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lyl.util.JavaUtils;

public class FirstJdbcDemo {

	/**
	 * 实现对数据库的添 删 改 查。以及statement时的批处理操作
	 */
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement sta = null;
		ResultSet rs = null;
		
		//调用工具类的静态方法，获得Connection对象
		try {
			conn = JavaUtils.getConn();
			sta = conn.createStatement();
			
			//添
/*			String addStr = "INSERT INTO users VALUES(3,'luck','2000-03-22',5000);";
			int i = sta.executeUpdate(addStr);
			if(i != 0)
				System.out.println("添加成功");*/
			
			//查
/*			String queryStr = "SELECT * FROM users;";
			rs = sta.executeQuery(queryStr);
			//打印查询结果
			while(rs.next()){
				System.out.println("id = "+ rs.getInt("id")+
						" name = "+ rs.getString("name")+
						" birthday = "+ rs.getDate("birthday")+
						" money = "+ rs.getFloat("money"));
			}*/
			
			//改
/*			String updateStr = "UPDATE users SET money=3000 WHERE id = 1;";
			int i = sta.executeUpdate(updateStr);
			if(i != 0)
				System.out.println("修改成功");*/
			
			//删
/*			String deleteStr = "DELETE FROM users WHERE id = 3;";
			int i = sta.executeUpdate(deleteStr);
			if(i != 0)
				System.out.println("删除成功");*/
			
			//批处理
			String addStr1 = "INSERT INTO users VALUES(3,'luck','2000-03-22',4000);";
			String addSt2 = "INSERT INTO users VALUES(4,'maria','1999-11-2',3000);";
			String addStr3 = "INSERT INTO users VALUES(5,'demon','2004-8-21',7000);";
			sta.addBatch(addStr1);
			sta.addBatch(addSt2);
			sta.addBatch(addStr3);
			int[] arr = sta.executeBatch();	//执行批处理命令
			for (int i : arr) {
				System.out.println(i);		
			}
			sta.clearBatch();				//清除批处理命令
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			//释放资源
			JavaUtils.free(conn,sta,rs);
		}

	}

}
