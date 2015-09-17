package com.lyl.cookie2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OneProduct extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//��ȡĳ���ֻ��Ķ���
		String id = request.getParameter("id");
		Cellphone phone = PhoneDatabase.getOnePhone(id);
		
		out.print(phone.getName()+"�������£�<br>"+phone.toString()+"<br>");
		out.print("<a href='AllProducts'> ������ҳ</a>");
		
		//�����3��������ֻ�����ҳ�ı�����У��� 1-2-3
		String list =  getList(request, id);
		
		//��listд��cookie�У���phoneList��Ϊ���
		Cookie browseList = new Cookie("phoneList", list);
		browseList.setMaxAge(60*60);
		response.addCookie(browseList);

	}

	private String getList(HttpServletRequest request, String id) {
		
		Cookie[] cookies = request.getCookies();
		Cookie phoneCookie = null;				//�����ֻ�id��cookie
		
		if(cookies == null)
			return id;
		else{
			for (Cookie cookie : cookies) {
				if("phoneList".equals(cookie.getName())){
					phoneCookie = cookie;
				}
			}
		}
		
		//�״η���ĳ���ֻ�����ҳ��ֱ�ӷ���id
		if(phoneCookie == null)
			return id;
		
		//���cookie�е�ֵ
		String values = phoneCookie.getValue();
		
		//�ԡ�-�����зָ�,���֮ǰ���ʵ�����id
		String[] ids = values.split("-");
		
		LinkedList<String> queue = new LinkedList<String>(Arrays.asList(ids));
		//��֮ǰ���ʵ��ֻ�����ҳ����3������ʱ
		if(queue.size() < 3){
			//��ʱ���ʵ�ҳ��֮ǰ���ʹ�����ɾ��ԭ�������id,�ڼ����id
			if(queue.contains(id))
				queue.remove(id);
			queue.add(id);		
		}else{
			//����ҳ�����3ʱ�������ҳ��id���ڴ����ids�У���ɾ��id�����û�У�ɾ�����е�һ��Ԫ�أ�Ȼ�����id
			if(queue.contains(id))
				queue.remove(id);
			else
				queue.removeFirst();
			queue.add(id);
		}
		
		//�������� 1-2-3���ַ���
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<queue.size(); i++){
			
			String data = queue.get(i);
			if(i != 0)
				sb.append("-");
			sb.append(data);
		}
		
		return sb.toString();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
