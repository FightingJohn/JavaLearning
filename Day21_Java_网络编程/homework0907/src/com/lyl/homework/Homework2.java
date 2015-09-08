package com.lyl.homework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class Homework2 {

	/**
	 * ���ݽ����Ͽε����ݣ�ģ��ʵ��һ��ping��������ڼ��ĳ������http�����Ƿ��д򿪡�
	 * ����ʾ��http����Ĭ�϶˿�Ϊ80��������tcp socket�����ԣ�
	 */
	public static void main(String[] args) {
		
		//���������ٶ�
		
		String host = "www.baidu.com";
		int timeout = 3000;				//��ʱӦ����3������
		InetAddress ia;
		try {
			ia = InetAddress.getByName(host);
			
			//�����Ƿ���Դﵽ�õ�ַ
			boolean status = ia.isReachable(timeout);
			if(status){
				System.out.println("���� "+ia.getHostAddress()+" �ظ������ӿ��ã�");
			}
			else{
				System.out.println("���� "+ia.getHostAddress()+" �ظ����޷�����Ŀ��������");
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
