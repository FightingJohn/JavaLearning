package com.lyl.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lyl.bean.User;
import com.lyl.dao.SaveDataInference;
import com.lyl.daoImpl.SaveToMysql;

public class Contorller extends HttpServlet {
	
	private SaveDataInference saveToXml = new SaveToMysql();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			 {
		response.setContentType("text/html; charset=utf-8");
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//���jsp��Я����typeֵ���ж��ǵ�¼����ע��
		String type = request.getParameter("type");
		System.out.println(type);
		if("login".equals(type))
			doLogin(request, response);
		else if("register".equals(type))
			doRegister(request, response);
		else if("logout".equals(type))
			doLogout(request, response);
		
		
	}

	//ע������
	private void doLogout(HttpServletRequest request,
			HttpServletResponse response) {
		
		// ɾ��session�е�username��������session��Ч
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("this doLogout");
		HttpSession hs = request.getSession();
		hs.removeAttribute("result");
		hs.invalidate();					//����session��Ч
		out.write("ע���ɹ��������ص���ҳ");
		response.setHeader("refresh", "1;url=/0925MVC/index.jsp");
		
	}

	//��¼����
	private void doLogin(HttpServletRequest request,
			HttpServletResponse response) {
		
		PrintWriter out = null;
		response.setContentType("text/html; charset=utf-8");
		try {
			request.setCharacterEncoding("utf-8");
			out = response.getWriter();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//��¼�ɹ�
		if(saveToXml.findUser(username, password)){
			
			//��¼�ɹ�ʱ����session��д���¼��username
			HttpSession hs = request.getSession();
			hs.setAttribute("result", username);
			
			out.write("��ϲ�㣬��¼�ɹ�������������ҳ");
			response.setHeader("refresh", "1;url=/0925MVC/index.jsp");
		}else{
			out.write("�û��������벻��ȷ�����µ�¼");
			 response.setHeader("refresh", "2;url=/0925MVC/jsp/login.jsp");
		}
		
	}

	//ע�ᴦ��
	private void doRegister(HttpServletRequest request,
			HttpServletResponse response) {
		
		PrintWriter out = null;
		response.setContentType("text/html; charset=utf-8");
		try {
			request.setCharacterEncoding("utf-8");
			out = response.getWriter();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		String email = request.getParameter("email");
		
		User user = new User(username, password, email);
		
		//�ж�ע�����Ϣ�Ƿ���Ч
		//��������������Ƿ�һ��
		if(username.isEmpty() || password.isEmpty() 
				|| password2.isEmpty() || email.isEmpty()){
			out.write("*��ǵı������Ϊ�գ�������ע��");
			//2s����ʾע��ҳ��
			response.setHeader("refresh", "2;url=/0925MVC/jsp/register.jsp");
			
		}else{
			//ȷ��������״��������벻ƥ��
			 if(password.equals(password2) == false){
				 out.write("�����ȷ�����벻ƥ�䣬����������");
				 response.setHeader("refresh", "2;url=/0925MVC/jsp/register.jsp");
			 }
			 //�û��Ѿ���ע��
			 else if(saveToXml.findUsername(username)){
				 out.write("���û����Ѿ���ע�ᣬ������ע��");
				 response.setHeader("refresh", "2;url=/0925MVC/jsp/register.jsp");
			 }
			 //ע����Ϣ����Ҫ��д�뵽xml�ļ���
			 else{
				//����ע����Ϣ
				saveToXml.saveData(user);
				out.write("��ϲ�㣬ע��ɹ�");
				response.setHeader("refresh", "2;url=/0925MVC/index.jsp");
			 }
			 
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response){
		
		doGet(request,response);
	}

}
