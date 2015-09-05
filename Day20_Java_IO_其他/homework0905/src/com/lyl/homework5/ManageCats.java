package com.lyl.homework5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManageCats {

	/**
	 * ����Cat��
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		

		//���л�
		serializeCats();
		
		//�����л�
		deSerializeCats();
		
	}

	//��cats.txt�еĶ����������ӡ����Ϣ
	private static void deSerializeCats() throws IOException,
			FileNotFoundException, ClassNotFoundException {
		
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("cats.txt"));
		
		//��ӡè����Ϣ
		Cat cat = (Cat) ois.readObject();
			
		System.out.println(cat.toString());
		cat.skill();
		
		ois.close();
	}

	//��Cat���ʵ��д�뵽cats.txt
	private static void serializeCats() throws IOException,
			FileNotFoundException {
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("cats.txt"));
		
		Cat cat1 = new Cat("����", 3, "female");
		
		oos.writeObject(cat1);
		
		oos.close();
	}

}
