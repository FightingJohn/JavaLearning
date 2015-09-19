package com.lyl.fileUpload;

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

public class UploadFile extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int sum = 0;		//表示文件上传成功的数目		
		response.setContentType("text/html; charset=utf-8");
		// 1,创建DiskFileItemFactory对象
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
					File tempFile = new File(fileName);
					String uploadName = tempFile.getName();
					
					//问题1：如果多用户同时上传文件名相同的文件，为了加以区别，使用UUID给每个文件做唯一的标识
					UUID uuid = UUID.randomUUID();
					String onlyName = uuid.toString()+"_"+uploadName;
//					System.out.println("fieldName="+fileItem.getFieldName());	//jsp中type="file"的input中定义的name值
//					System.out.println("name="+fileName);						//文件的路径加名称
//					System.out.println("string="+fileItem.getString());			//文本内容
					
					//问题2：如果一个文件夹下面上传太多的文件，会造成无法打开此文件夹的问题
					int hashcode = onlyName.hashCode();
					String hexHashcode = Integer.toHexString(hashcode);
					char[] ch = hexHashcode.toCharArray();
					String onlyPath = request.getRealPath("upload");
					for(int i=0; i<ch.length; i++){
						onlyPath = onlyPath +"/"+ ch[i];
					}
					
					File finalPath = new File(onlyPath);
					finalPath.mkdirs();
					
					System.out.println(onlyPath);
					InputStream in = fileItem.getInputStream();
					//upload为上传文件存放目录
//					System.out.println("uploadName="+uploadName);			
					File file = new File(onlyPath+"/"+onlyName);
					
//					System.out.println(request.getRealPath("upload"));
					FileOutputStream fos = new FileOutputStream(file);
					byte[] b = new byte[1024];
					int len = 0;
					while((len = in.read(b, 0, 1024)) != -1){
						
						fos.write(b, 0, len);
						
					}
					fos.close();
					in.close();
					
					response.getWriter().println(++sum+"上传成功！");
				}
				
			}
			
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
