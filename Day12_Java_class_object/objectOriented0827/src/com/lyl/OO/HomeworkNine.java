package com.lyl.OO;

public final class HomeworkNine {

	/**
	 * �ؼ��� final�� static�� final static ����
	 */
	
	final int fx = 1;
	static int sx = 2;
	final static int fsx = 3;
	
	public static void main(String[] args) {
		
		HomeworkNine hn1 = new HomeworkNine();
		HomeworkNine hn2 = new HomeworkNine();
//		hn1.fx = 3;				//������ʾremove final
		hn1.sx = 4;
//		hn1.fsx = 6;			//������ʾremove final
		System.out.println("hn1.sx = " + hn1.sx);
		
		System.out.println("hn2�޸�sx��-------");
//		hn2.fx = 3;				//������ʾremove final
		hn2.sx = 5;
//		hn2.fsx = 6;			//������ʾremove final
		System.out.println("hn1.sx = " + hn1.sx);
		System.out.println("hn2.sx = " + hn2.sx);

	}
	
	//����final���εķ���
	final void setsx(){
		this.sx = 0;
	}

}
/* ����  ��ʾȥ�� HomeworkNine ��final
class Test extends HomeworkNine{
	
	//���Ǹ����setsx��������
//	void setsx(){					//������ʾȥ������setsx������final���η�
//		
//	}
}
*/
