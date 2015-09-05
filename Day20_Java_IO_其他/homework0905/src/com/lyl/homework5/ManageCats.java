package com.lyl.homework5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManageCats {

	/**
	 * 管理Cat类
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		

		//序列化
		serializeCats();
		
		//反序列化
		deSerializeCats();
		
	}

	//将cats.txt中的对象读出并打印其信息
	private static void deSerializeCats() throws IOException,
			FileNotFoundException, ClassNotFoundException {
		
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("cats.txt"));
		
		//打印猫的信息
		Cat cat = (Cat) ois.readObject();
			
		System.out.println(cat.toString());
		cat.skill();
		
		ois.close();
	}

	//将Cat类的实例写入到cats.txt
	private static void serializeCats() throws IOException,
			FileNotFoundException {
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("cats.txt"));
		
		Cat cat1 = new Cat("咪咪", 3, "female");
		
		oos.writeObject(cat1);
		
		oos.close();
	}

}
