package com.lyl.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lyl.util.JavaUtils;

public class Homework2 {

	/**
	 * ����֪���ݿ���Ϣ��������Ϣ��ѯ
	 */
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			//��������
			conn = JavaUtils.getConn();
			
			//1,�г�emp���и����ŵĲ��źţ���߹��ʣ���͹���
/*			String sql1 = "SELECT MAX(sal),MIN(sal) FROM dept d LEFT OUTER JOIN emp e ON d.`deptno`=e.`deptno` WHERE d.`dname`='��ҵ��'" +
					"UNION SELECT MAX(sal),MIN(sal) FROM dept d LEFT OUTER JOIN emp e ON d.`deptno`=e.`deptno` WHERE d.`dname`='���۲�'" +
					"UNION SELECT MAX(sal),MIN(sal) FROM dept d LEFT OUTER JOIN emp e ON d.`deptno`=e.`deptno` WHERE d.`dname`='������';";
			
			//����PreparedStatement�����˹���,������sql���
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("������-��߹���\t"+"��͹���");
			while(rs.next()){
				System.out.println("\t"+rs.getString("MAX(sal)")+"\t"+rs.gettring("MIN(sal)"));
			}*/
			
			//2,�г�emp���и�����jobΪ'CLERK'��Ա������͹��ʣ���߹���
/*			String sql1 = "SELECT MAX(sal),MIN(sal) FROM emp WHERE job='clerk';";
			
			//����PreparedStatement�����˹���,������sql���
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("jobΪ'CLERK'��Ա��-��߹���\t"+"��͹���");
			while(rs.next()){
				System.out.println("\t"+rs.getString("MAX(sal)")+"\t"+rs.getString("MIN(sal)"));
			}*/
			
			//3,����emp����͹���С��2000�Ĳ��ţ��г�jobΪ'CLERK'��Ա���Ĳ��źţ���͹��ʣ���߹���
/*			String sql1 = "SELECT deptno,MAX(s),MIN(s) FROM (SELECT deptno,sal s, " +
					"job j FROM emp GROUP BY deptno HAVING MIN(sal)<2000)AS res WHERE j='clerk'";
			
			//����PreparedStatement�����˹���,������sql���
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("���ź�"+"\t"+"��͹���"+"\t"+"��߹���");
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
