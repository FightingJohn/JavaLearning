package com.lyl.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lyl.util.JavaUtils;

public class Homework2 {

	/**
	 * 对已知数据库信息，进行信息查询
	 */
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			//建立连接
			conn = JavaUtils.getConn();
			
			//1,列出emp表中各部门的部门号，最高工资，最低工资
/*			String sql1 = "SELECT MAX(sal),MIN(sal) FROM dept d LEFT OUTER JOIN emp e ON d.`deptno`=e.`deptno` WHERE d.`dname`='事业部'" +
					"UNION SELECT MAX(sal),MIN(sal) FROM dept d LEFT OUTER JOIN emp e ON d.`deptno`=e.`deptno` WHERE d.`dname`='销售部'" +
					"UNION SELECT MAX(sal),MIN(sal) FROM dept d LEFT OUTER JOIN emp e ON d.`deptno`=e.`deptno` WHERE d.`dname`='技术部';";
			
			//建立PreparedStatement“搬运工”,并输入sql语句
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("各部门-最高工资\t"+"最低工资");
			while(rs.next()){
				System.out.println("\t"+rs.getString("MAX(sal)")+"\t"+rs.gettring("MIN(sal)"));
			}*/
			
			//2,列出emp表中各部门job为'CLERK'的员工的最低工资，最高工资
/*			String sql1 = "SELECT MAX(sal),MIN(sal) FROM emp WHERE job='clerk';";
			
			//建立PreparedStatement“搬运工”,并输入sql语句
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("job为'CLERK'的员工-最高工资\t"+"最低工资");
			while(rs.next()){
				System.out.println("\t"+rs.getString("MAX(sal)")+"\t"+rs.getString("MIN(sal)"));
			}*/
			
			//3,对于emp中最低工资小于2000的部门，列出job为'CLERK'的员工的部门号，最低工资，最高工资
/*			String sql1 = "SELECT deptno,MAX(s),MIN(s) FROM (SELECT deptno,sal s, " +
					"job j FROM emp GROUP BY deptno HAVING MIN(sal)<2000)AS res WHERE j='clerk'";
			
			//建立PreparedStatement“搬运工”,并输入sql语句
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("部门号"+"\t"+"最低工资"+"\t"+"最高工资");
			while(rs.next()){
				System.out.println(rs.getString("deptno")
								+"\t"+rs.getString("MAX(s)")
								+"\t"+rs.getString("MIN(s)"));
			}*/
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, pst, rs);
		}

	}

}
