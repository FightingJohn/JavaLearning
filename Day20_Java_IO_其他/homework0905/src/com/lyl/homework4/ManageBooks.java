package com.lyl.homework4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManageBooks {

	/**
	 * 自己编写一个类(Book类)，然后实例化之，并将其保存到一个系统文件中。
	然后调用一个方法，将系统文件中保存的这个类读到系统内存里面。
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//序列化
		serializeBook();
		
		//反序列化
		deSerializeBooks();
		

	}

	//将book.txt中的对象读出并打印其信息
	private static void deSerializeBooks() throws IOException,
			FileNotFoundException, ClassNotFoundException {
		
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("books.txt"));
		
		//把所有的书信息都打印出来
		Book book = null;
		while((book = (Book) ois.readObject()) != null){
			
			System.out.println(book.toString());
		}

		ois.close();
	}

	//将Book类的实例写入到books.txt
	private static void serializeBook() throws IOException,
			FileNotFoundException {
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("books.txt"));
		Book book1 = new Book("4F10104", "朝花夕拾", 3);
		Book book2 = new Book("3C17812", "麦田里的守望者", 2);
		Book book3 = new Book("3J49283", "时代周刊", 5);
		
		//写入多本书
		oos.writeObject(book1);
		oos.writeObject(book2);
		oos.writeObject(book3);
		oos.writeObject(null);			//写一个null作为读时的结束标记。防止EOFException异常
		
		oos.close();
	}

}
