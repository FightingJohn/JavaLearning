package com.lyl.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	/**
	 * ObjectOutputStream �� Java ����Ļ�����������д�� OutputStream
	 * ObjectInputStream ����ǰʹ�� ObjectOutputStream д��Ļ������ݺͶ�����з����л�
	 * ��student����д��object.txt,Ȼ���ڶ�������ӡstudent��Ϣ
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
		
		Student stu = (Student) ois.readObject();					//�������󣬻ᱨ����ʱ�쳣ClassNotFoundException
		System.out.println("ѧ����Ϣ��"+stu.getName()+" "+stu.getAge()+" "+stu.getGender());
		
		ois.close();
	}

	//���л�
	private static void serialize() throws IOException {
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("object.txt"));
		
		Student student = new Student("lyl", 23, "male");			//ʵ��������
		oos.writeObject(student);
		
		oos.close();
	}
}
