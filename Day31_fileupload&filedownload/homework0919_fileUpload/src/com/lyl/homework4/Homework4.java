package com.lyl.homework4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class Homework4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		// 1,����DiskFileItemFactory����,�޻���
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// 2��ʹ��DiskFileItemFactory���󴴽�
		ServletFileUpload upload = new ServletFileUpload(factory);
		// �����ļ��ϴ��Ĵ�С����1M
		//upload.setSizeMax(1024 * 1024);
		upload.setHeaderEncoding("utf-8");

		// 3������ServletFileUpload.parseRequest��������request���󣬵õ�һ�������������ϴ����ݵ�List����
		try {
			List<FileItem> parseRequest = upload.parseRequest(request);
			for (FileItem fileItem : parseRequest) {
				//�ж��Ƿ�Ϊ�ı�����
				if(fileItem.isFormField()){
					
				}else{
					//������ļ���д��ָ��Ŀ¼��
					String fileName = fileItem.getName();		//�ļ�·��+�ļ�����
					//��ȡ�ļ�����
					File tempFile = new File(fileName);
					String uploadName = tempFile.getName();
					
					//����1��������û�ͬʱ�ϴ��ļ�����ͬ���ļ���Ϊ�˼�������ʹ��UUID��ÿ���ļ���Ψһ�ı�ʶ
					UUID uuid = UUID.randomUUID();
					String onlyName = uuid.toString()+"_"+uploadName;
					
					//����2�����һ���ļ��������ϴ�̫����ļ���������޷��򿪴��ļ��е�����
					int hashcode = onlyName.hashCode();
					String hexHashcode = Integer.toHexString(hashcode);
					//��16���Ƶ�hashcode�ַ����������ɶ���ļ��и�ʽ�����磺a/6/f/e/4
					char[] ch = hexHashcode.toCharArray();
					String onlyPath = request.getRealPath("upload");
					for(int i=0; i<ch.length; i++){
						onlyPath = onlyPath +"/"+ ch[i];
					}
					
					//��������ļ���
					File finalPath = new File(onlyPath);
					finalPath.mkdirs();
					
					InputStream in = fileItem.getInputStream();
					//����ϴ��ļ��ĵص������
					File file = new File(onlyPath+"/"+onlyName);
					
					FileOutputStream fos = new FileOutputStream(file);
					byte[] b = new byte[1024];
					int len = 0;
					while((len = in.read(b, 0, 1024)) != -1){
						
						fos.write(b, 0, len);
						
					}
					fos.close();
					in.close();
					
					response.getWriter().println("�ϴ��ɹ���");
				}
				
			}
			
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
