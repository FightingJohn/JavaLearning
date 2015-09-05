package com.lyl.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	/**
	 * ObjectOutputStream 将 Java 对象的基本数据类型写入 OutputStream
	 * ObjectInputStream 对以前使用 ObjectOutputStream 写入的基本数据和对象进行反序列化
	 * 将student对象写入object.txt,然后在读出，打印student信息
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws FileNotFoundException 
	 */
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
//		serialize();
		
		deSerialize();
		
	}

	private static void deSerialize() throws IOException,
			FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
		
		Student stu = (Student) ois.readObject();					//读出对象，会报编译时异常ClassNotFoundException
		System.out.println("学生信息："+stu.getName()+" "+stu.getAge()+" "+stu.getGender());
		
		ois.close();
	}

	//序列化
	private static void serialize() throws IOException {
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("object.txt"));
		
		Student student = new Student("lyl", 23, "male");			//实例化对象
		oos.writeObject(student);
		
		oos.close();
	}
}
