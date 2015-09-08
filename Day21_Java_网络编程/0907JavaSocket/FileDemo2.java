package file;

import java.io.File;

public class FileDemo2 {

	/**
	 * 2.8获得系统可使用目录以及文件下的所有文件名
	 */
	public static void main(String[] args) {
		listDemo();

	}
	
	public static void listDemo(){
		File f = new File("E:\\");
		//调用list方法的file对象必须是封装了的一个目录
		String[]names = f.list();
		for(String name:names)
			System.out.println(name);
	}
	//获取系统目录
	public static void listRootsDemo(){
		File[]files = File.listRoots();
		for(File file : files)
			System.out.println(file);
	}
	

}
