package com.lyl.demo2;

public class Eighteen {

	/**
	 * ��Ŀ������ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ�
	 * �ѳ�ǩ���������������������Ա����������������a˵������x�ȣ�
	 * c˵������x,z�ȣ��������ҳ��������ֵ�����
	 */
	public static void main(String[] args) {
		
		//��ʾ�׶�����
		char a='\0', b='\0', c='\0';
		//�Ҷ����˴�������ֽ�������
		char[] ch = {'x','y','z'};
		
		//ȷ��c�Ķ���
		for(int i=0; i<3; i++){
			if(ch[i] != 'x' && ch[i] != 'z'){
				c = ch[i];
			}
		}
		
		//ȷ��a�Ķ���
		for(int i=0; i<3; i++){
			if(ch[i] != 'x' && ch[i] != c){
				a = ch[i];
			}
		}
		
		//ȷ��b�Ķ���
		for(int i=0; i<3; i++){
			if(ch[i] != a && ch[i] != c){
				b = ch[i];
			}
		}
		
		System.out.println("a��b��c�Ķ��ֱַ�Ϊ: "+a+","+b+","+c);
	}

}
