package com.lyl.homework4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManageBooks {

	/**
	 * �Լ���дһ����(Book��)��Ȼ��ʵ����֮�������䱣�浽һ��ϵͳ�ļ��С�
	Ȼ�����һ����������ϵͳ�ļ��б������������ϵͳ�ڴ����档
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//���л�
		serializeBook();
		
		//�����л�
		deSerializeBooks();
		

	}

	//��book.txt�еĶ����������ӡ����Ϣ
	private static void deSerializeBooks() throws IOException,
			FileNotFoundException, ClassNotFoundException {
		
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("books.txt"));
		
		//�����е�����Ϣ����ӡ����
		Book book = null;
		while((book = (Book) ois.readObject()) != null){
			
			System.out.println(book.toString());
		}

		ois.close();
	}

	//��Book���ʵ��д�뵽books.txt
	private static void serializeBook() throws IOException,
			FileNotFoundException {
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("books.txt"));
		Book book1 = new Book("4F10104", "����Ϧʰ", 3);
		Book book2 = new Book("3C17812", "�������������", 2);
		Book book3 = new Book("3J49283", "ʱ���ܿ�", 5);
		
		//д��౾��
		oos.writeObject(book1);
		oos.writeObject(book2);
		oos.writeObject(book3);
		oos.writeObject(null);			//дһ��null��Ϊ��ʱ�Ľ�����ǡ���ֹEOFException�쳣
		
		oos.close();
	}

}
