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
			
			//4,���ݲ��ź��ɸ߶��ͣ������еͶ����г�ÿ��Ա�������������źţ�����
/*			String sql1 = "SELECT ename, deptno, sal FROM emp ORDER BY deptno DESC, sal;" ;
			
			//����PreparedStatement�����˹���,������sql���
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("ename"+"\t"+"deptno"+"\t"+"sal");
			while(rs.next()){
				System.out.println(rs.getString("ename")
								+"\t"+rs.getString("deptno")
								+"\t"+rs.getString("sal"));
			}*/
			
			//5,�г�'buddy'���ڲ�����ÿ��Ա���������벿�ź�
/*			String sql1 = "SELECT ename, deptno FROM emp WHERE deptno IN(SELECT deptno FROM emp WHERE ename='buddy') ;" ;
			
			//����PreparedStatement�����˹���,������sql���
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("ename"+"\t"+"deptno");
			while(rs.next()){
				System.out.println(rs.getString("ename")
								+"\t"+rs.getString("deptno"));
			}*/
			
			//6,�г�ÿ��Ա�������������������źţ�������
/*			String sql1 = "SELECT ename,job,d.deptno,dname FROM dept d INNER JOIN emp e ON d.`deptno`=e.`deptno` ;" ;
			
			//����PreparedStatement�����˹���,������sql���
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
			
			//7,�г�emp�й���Ϊ'CLERK'��Ա�������������������źţ�������
/*			String sql1 = "SELECT ename,job,d.deptno,d.dname FROM dept d LEFT OUTER JOIN " +
					"emp e ON d.`deptno`=e.`deptno` WHERE e.`job`='clerk';" ;
			
			//����PreparedStatement�����˹���,������sql���
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
			
			//8,����emp���й����ߵ�Ա�����г����������������������������Ϊmgr��
/*			String sql1 = "SELECT ename, mgr FROM emp WHERE mgr NOT IN('');" ;
			
			//����PreparedStatement�����˹���,������sql���
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("ename"+"\t"+"mgr");
			while(rs.next()){
				System.out.println(rs.getString("ename")
								+"\t"+rs.getString("mgr"));
			}*/
			
			//9,����dept���У��г����в����������źţ�ͬʱ�г������Ź���Ϊ'CLERK'��Ա�����빤��
/*			String sql1 = "SELECT d.`deptno`,d.`dname`,e.`ename`,e.`job` FROM dept d " +
					"LEFT OUTER JOIN emp e ON d.`deptno`=e.`deptno`  WHERE e.`job`='clerk'; ";
			
			//����PreparedStatement�����˹���,������sql���
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
			
			//10,���ڹ��ʸ��ڱ�����ƽ��ˮƽ��Ա�����г����źţ����������ʣ������ź�����
/*			String sql1 = "SELECT deptno,a.ename,sal FROM emp AS a " +
					"WHERE a.`sal`>(SELECT AVG(sal) FROM emp AS b WHERE a.`deptno` = b.`deptno`) ORDER BY a.`deptno`; ";
			
			//����PreparedStatement�����˹���,������sql���
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("���ź�"+"\t"+"����"+"\t"+"����");
			while(rs.next()){
				System.out.println(rs.getString("deptno")
								+"\t"+rs.getString("ename")
								+"\t"+rs.getString("sal"));
			}*/
			
			//11,����emp���г����������й��ʸ��ڱ�����ƽ�����ʵ�Ա�����Ͳ��źţ������ź�����
/*			String sql1 = "SELECT COUNT(a.`sal`) AS c,a.`deptno` AS d FROM emp AS a " +
					"WHERE a.`sal`>(SELECT AVG(sal) FROM emp AS b WHERE a.`deptno` = b.`deptno`) GROUP BY a.`deptno` ORDER BY a.`deptno`;" ;
			
			//����PreparedStatement�����˹���,������sql���
			pst = conn.prepareStatement(sql1);
			pst.execute();
			
			rs = pst.getResultSet();
			System.out.println("Ա����"+"\t"+"���ź�");
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
