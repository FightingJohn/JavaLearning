package com.lyl.demo2;

public class ThirteenDemo {

	/**
	 * һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�
	 */
	public static void main(String[] args) {
		
		boolean flag = false;
		//����10000���ڵ���
		for(int num = 0; num < 10000; num++){
			int temp1 = (int)Math.sqrt(num+100);
			int temp2 = (int)Math.sqrt(num+168+100);
			if((Math.sqrt(num+100) - temp1) == 0 && (Math.sqrt(num+168+100) - temp2) == 0){
				System.out.print(num + " ");
				flag = true;
			}
		}
		
		if(flag == false)
			System.out.print("10000����û��Ҫ�ҵ���");
	}

}
