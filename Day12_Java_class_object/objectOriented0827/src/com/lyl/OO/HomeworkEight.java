package com.lyl.OO;

public class HomeworkEight {

	/**
	 * ���� pulic�� protected�� private�� ȱʡ����ʱ�ķ���Ȩ��
	 */
	
	public int pub;
	protected int pro;
	private int pri;
	int def;
	
	//�ڱ����ڲ�����
	public void setValue(){
		pub = 1;			//ok
		pro = 2;			//ok
		pri = 3;			//ok
		def = 4;			//ok
	}
}

//����ͬһ����������
class Test{
	public void setValue(){
		HomeworkEight he = new HomeworkEight();
		he.pub = 1;			// ok
		he.pro = 2;			// ok
//		he.pri = 3;			//not ok  ��ʾchage to default ����
		he.def = 4;			// ok
	}
}

//����ͬһ�����е�����
class Test1 extends HomeworkEight{
	public void setValue(){
		HomeworkEight he = new HomeworkEight();
		he.pub = 1;			// ok
		he.pro = 2;			// ok
//		he.pri = 3;			//not ok  ��ʾchage to protected ����
		he.def = 4;			// ok
	}
}
