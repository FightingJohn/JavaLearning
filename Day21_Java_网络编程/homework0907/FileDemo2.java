package file;

import java.io.File;

public class FileDemo2 {

	/**
	 * 2.8���ϵͳ��ʹ��Ŀ¼�Լ��ļ��µ������ļ���
	 */
	public static void main(String[] args) {
		listDemo();

	}
	
	public static void listDemo(){
		File f = new File("E:\\");
		//����list������file��������Ƿ�װ�˵�һ��Ŀ¼
		String[]names = f.list();
		for(String name:names)
			System.out.println(name);
	}
	//��ȡϵͳĿ¼
	public static void listRootsDemo(){
		File[]files = File.listRoots();
		for(File file : files)
			System.out.println(file);
	}
	

}
