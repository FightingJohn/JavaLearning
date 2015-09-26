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
			
			//4,根据部门号由高而低，工资有低而高列出每个员工的姓名，部门号，工资
/*			String sql1 = "SELECT ename, deptno, sal FROM emp ORDER BY deptno DESC, sal;" ;
			
			//建立PreparedStatement“搬运工”,并输入sql语句
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("ename"+"\t"+"deptno"+"\t"+"sal");
			while(rs.next()){
				System.out.println(rs.getString("ename")
								+"\t"+rs.getString("deptno")
								+"\t"+rs.getString("sal"));
			}*/
			
			//5,列出'buddy'所在部门中每个员工的姓名与部门号
/*			String sql1 = "SELECT ename, deptno FROM emp WHERE deptno IN(SELECT deptno FROM emp WHERE ename='buddy') ;" ;
			
			//建立PreparedStatement“搬运工”,并输入sql语句
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("ename"+"\t"+"deptno");
			while(rs.next()){
				System.out.println(rs.getString("ename")
								+"\t"+rs.getString("deptno"));
			}*/
			
			//6,列出每个员工的姓名，工作，部门号，部门名
/*			String sql1 = "SELECT ename,job,d.deptno,dname FROM dept d INNER JOIN emp e ON d.`deptno`=e.`deptno` ;" ;
			
			//建立PreparedStatement“搬运工”,并输入sql语句
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("ename"+"\t"+"job"+"\t"+"deptno"+"\t"+"dname");
			while(rs.next()){
				System.out.println(rs.getString("ename")
								+"\t"+rs.getString("job")
								+"\t"+rs.getString("deptno")
								+"\t"+rs.getString("dname"));
			}*/
			
			//7,列出emp中工作为'CLERK'的员工的姓名，工作，部门号，部门名
/*			String sql1 = "SELECT ename,job,d.deptno,d.dname FROM dept d LEFT OUTER JOIN " +
					"emp e ON d.`deptno`=e.`deptno` WHERE e.`job`='clerk';" ;
			
			//建立PreparedStatement“搬运工”,并输入sql语句
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("ename"+"\t"+"job"+"\t"+"deptno"+"\t"+"dname");
			while(rs.next()){
				System.out.println(rs.getString("ename")
								+"\t"+rs.getString("job")
								+"\t"+rs.getString("deptno")
								+"\t"+rs.getString("dname"));
			}*/
			
			//8,对于emp中有管理者的员工，列出姓名，管理者姓名（管理者外键为mgr）
/*			String sql1 = "SELECT ename, mgr FROM emp WHERE mgr NOT IN('');" ;
			
			//建立PreparedStatement“搬运工”,并输入sql语句
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("ename"+"\t"+"mgr");
			while(rs.next()){
				System.out.println(rs.getString("ename")
								+"\t"+rs.getString("mgr"));
			}*/
			
			//9,对于dept表中，列出所有部门名，部门号，同时列出各部门工作为'CLERK'的员工名与工作
/*			String sql1 = "SELECT d.`deptno`,d.`dname`,e.`ename`,e.`job` FROM dept d " +
					"LEFT OUTER JOIN emp e ON d.`deptno`=e.`deptno`  WHERE e.`job`='clerk'; ";
			
			//建立PreparedStatement“搬运工”,并输入sql语句
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("deptno"+"\t"+"dname"+"\t"+"ename"+"\t"+"job");
			while(rs.next()){
				System.out.println(rs.getString("deptno")
								+"\t"+rs.getString("dname")
								+"\t"+rs.getString("ename")
								+"\t"+rs.getString("job"));
			}*/
			
			//10,对于工资高于本部门平均水平的员工，列出部门号，姓名，工资，按部门号排序
/*			String sql1 = "SELECT deptno,a.ename,sal FROM emp AS a " +
					"WHERE a.`sal`>(SELECT AVG(sal) FROM emp AS b WHERE a.`deptno` = b.`deptno`) ORDER BY a.`deptno`; ";
			
			//建立PreparedStatement“搬运工”,并输入sql语句
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("部门号"+"\t"+"姓名"+"\t"+"工资");
			while(rs.next()){
				System.out.println(rs.getString("deptno")
								+"\t"+rs.getString("ename")
								+"\t"+rs.getString("sal"));
			}*/
			
			//11,对于emp，列出各个部门中工资高于本部门平均工资的员工数和部门号，按部门号排序
/*			String sql1 = "SELECT COUNT(a.`sal`) AS c,a.`deptno` AS d FROM emp AS a " +
					"WHERE a.`sal`>(SELECT AVG(sal) FROM emp AS b WHERE a.`deptno` = b.`deptno`) GROUP BY a.`deptno` ORDER BY a.`deptno`;" ;
			
			//建立PreparedStatement“搬运工”,并输入sql语句
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("员工数"+"\t"+"部门号");
			while(rs.next()){
				System.out.println(rs.getString("c")
								+"\t"+rs.getString("d"));
			}*/
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JavaUtils.free(conn, pst, rs);
		}

	}

}
