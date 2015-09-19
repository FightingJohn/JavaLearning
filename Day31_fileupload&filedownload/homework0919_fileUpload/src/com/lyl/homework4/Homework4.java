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
		// 1,创建DiskFileItemFactory对象,无缓存
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// 2，使用DiskFileItemFactory对象创建
		ServletFileUpload upload = new ServletFileUpload(factory);
		// 设置文件上传的大小限制1M
		//upload.setSizeMax(1024 * 1024);
		upload.setHeaderEncoding("utf-8");

		// 3，调用ServletFileUpload.parseRequest方法解析request对象，得到一个保存了所有上传内容的List对象。
		try {
			List<FileItem> parseRequest = upload.parseRequest(request);
			for (FileItem fileItem : parseRequest) {
				//判断是否为文本内容
				if(fileItem.isFormField()){
					
				}else{
					//如果是文件，写入指定目录中
					String fileName = fileItem.getName();		//文件路径+文件名称
					//获取文件名称
					File tempFile = new File(fileName);
					String uploadName = tempFile.getName();
					
					//问题1：如果多用户同时上传文件名相同的文件，为了加以区别，使用UUID给每个文件做唯一的标识
					UUID uuid = UUID.randomUUID();
					String onlyName = uuid.toString()+"_"+uploadName;
					
					//问题2：如果一个文件夹下面上传太多的文件，会造成无法打开此文件夹的问题
					int hashcode = onlyName.hashCode();
					String hexHashcode = Integer.toHexString(hashcode);
					//把16进制的hashcode字符串，制作成多层文件夹格式，形如：a/6/f/e/4
					char[] ch = hexHashcode.toCharArray();
					String onlyPath = request.getRealPath("upload");
					for(int i=0; i<ch.length; i++){
						onlyPath = onlyPath +"/"+ ch[i];
					}
					
					//创建多层文件夹
					File finalPath = new File(onlyPath);
					finalPath.mkdirs();
					
					InputStream in = fileItem.getInputStream();
					//存放上传文件的地点加名称
					File file = new File(onlyPath+"/"+onlyName);
					
					FileOutputStream fos = new FileOutputStream(file);
					byte[] b = new byte[1024];
					int len = 0;
					while((len = in.read(b, 0, 1024)) != -1){
						
						fos.write(b, 0, len);
						
					}
					fos.close();
					in.close();
					
					response.getWriter().println("上传成功！");
				}
				
			}
			
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
