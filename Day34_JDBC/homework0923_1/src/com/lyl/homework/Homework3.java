package com.lyl.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lyl.util.JavaUtils;

public class Homework3 {

	/**
	 * 每条插入处理和批处理的时间比较
	 */
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		//程序开始时间
		long startTime = System.currentTimeMillis();
		
		try {
			//建立连接
			conn = JavaUtils.getConn();
			st = conn.createStatement();
/*			//一个一个插入 耗时    24240 毫秒
			for(int i=1; i<=1000; i++){
				String str = "INSERT INTO student1 VALUES("+i+",'zhang',60,60,60);";
				st.executeUpdate(str);
			}
			System.out.println("一个一个插入，");*/
			
			
			//批处理    22840毫秒
			for(int i=1; i<=1000; i++){
				String str = "INSERT INTO student1 VALUES("+i+",'zhang',60,60,60);";
				st.addBatch(str);
				if(i % 100 == 0)
					st.executeBatch();
			}
//			st.executeBatch();
			st.clearBatch();
			System.out.println("批处理，");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, st, rs);
		}
		
		
		//程序结束时间
		long endTime = System.currentTimeMillis();
		
		System.out.println("整个程序耗时："+(endTime - startTime));

	}
	

}
