package com.lyl.demo2;

public class ElevenDemo {

	/**
	 * ��1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
	 * ��������������ڰ�λ��ʮλ����λ�����ֶ���1��2��3��4��������е����к���ȥ ������������������
	 */
	public static void main(String[] args) {
		
		int count = 0;				//��¼���������3λ��
		for(int hund = 1; hund < 5; hund++){
			for(int ten = 1; ten < 5; ten++){
				if(hund == ten)
					continue;
				for(int last = 1; last < 5; last++){
					if(last != hund && last != ten){
						System.out.print(hund*100+ten*10+last + " ");
						count++;
					}
				}
			}
		}
		System.out.println();
		System.out.println("һ��  "+ count + "��");

	}

}
