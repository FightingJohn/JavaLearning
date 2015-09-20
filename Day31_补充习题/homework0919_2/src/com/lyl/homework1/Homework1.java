package com.lyl.homework1;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Homework1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		//����ύ���û�����email
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		//��õ�¼ʱ��ʱ��
		Date date = new Date();
		
		
		//�����û��ĵ�¼����email�Լ���¼ʱ�䱣�浽cookie�У��ã���Ϊ�ָ���
		Cookie cookie = new Cookie("usercookie", username+":"+email+":"+date.toString());
		//����cookie�ı���ʱ��Ϊ30��,����ΧΪ����������
		cookie.setMaxAge(60*60*24*30);
		cookie.setPath("/");
		response.addCookie(cookie);
//		System.out.println("servlet is over");//�ϵ����
		
		//��������е�cookie
		Cookie[] cookies = request.getCookies();
		
		//���жϽ������ͬһ����ת��yes������Ϊno��ת����Login.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("../jsp/Login.jsp");
		if(cookies != null){
//			System.out.println("cookies ��Ϊ��");
			for(int i=0; i<cookies.length; i++){
				if("usercookie".equals(cookies[i].getName())){
//					System.out.println("�ҵ���usercookie");
					//��cookie�л��usercookie-username:email:date.tostring
					String usercookie = cookies[i].getValue();
					//�ָ�username��email��date
					String[] strs = usercookie.split(":");

					//�ж��Ƿ�Ϊͬһ���û���¼
					if(username.equals(strs[0]) && email.equals(strs[1])){
						request.setAttribute("result", "yes:"+strs[2]);
//						System.out.println("ͬһ���û���¼");//�ϵ����
						break;
					}else{
						request.setAttribute("result", "no");
//						System.out.println("��ͬ�û���¼");//�ϵ����
						break;
					}
					
				}
			}
		}else{
			request.setAttribute("result", "no");		
//			System.out.println("��ͬ�û���¼");				//�ϵ����
		}
		dispatcher.forward(request, response);
		
		
	}

}
